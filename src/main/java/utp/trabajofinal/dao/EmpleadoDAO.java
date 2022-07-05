
package utp.trabajofinal.dao;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.trabajofinal.entities.Empresa;
import utp.trabajofinal.sqlhandler.ConnectionInfo;
import utp.trabajofinal.sqlhandler.MySQLHandler;
import utp.trabajofinal.ui.MainInterface;
import utp.trabajofinal.ui.MessageHandler;
import utp.trabajofinal.crudInterfaces.SimpleCrudInterface;
import utp.trabajofinal.entities.Empleado;

public class EmpleadoDAO implements SimpleCrudInterface<Empleado> {
    private final ConnectionInfo connectionInfo;
    private final MySQLHandler con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public EmpleadoDAO(){
        this.connectionInfo = MainInterface.connectionInfo;
        this.con = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
    
}

    @Override
    public List<Empleado> listar(String text) {
        List<Empleado> registros = new ArrayList();
        try {
            ps = con.conectar().prepareStatement("SELECT * FROM empleado WHERE nombre LIKE ?;");
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Empleado(rs.getInt(1),
                                          rs.getString(2),
                                          rs.getString(3),
                                          rs.getInt(4),
                                          rs.getInt(5),
                                          rs.getInt(6)));
            }
            
            ps.close();
            rs.close();
        } catch (SQLException e) {
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            rs = null;
            con.desconectar(); 
        }
        return registros;
    }

    @Override
    public boolean insertar(Empleado obj) {
        boolean conf = false;
        try {
            ps = con.conectar().prepareStatement("INSERT INTO empleado (nombre, apellido, IDzona, IDempresa, IDciudadano) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getApellido());
            ps.setInt(3, obj.getIDzona());
            ps.setInt(4, obj.getIDempresa());
            ps.setInt(5, obj.getIDciudadano());
            if(ps.executeUpdate() > 0){
                conf = true;
            }
            ps.close();
        } catch (SQLException e) {
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            con.desconectar();
        }
        return conf;
    }
    

    @Override
    public boolean actualizar(Empleado obj) {
            boolean conf = false;
        try{
            ps = con.conectar().prepareStatement("UPDATE empresa SET nombre = ?, apellido = ?, IDzona = ?, IDempresa = ?, IDciudadano = ? WHERE IDempleado = ?");
            ps.setString(1, obj.getNombre());
            ps.setString(1, obj.getApellido());
            ps.setInt(1, obj.getIDzona());
            ps.setInt(1, obj.getIDempresa());
            ps.setInt(1, obj.getIDciudadano());
            ps.setInt(1, obj.getIDempleado());
            if (ps.executeUpdate() > 0) {
                conf = true;
            }
            ps.close();
        } catch (SQLException e){
            MessageHandler.exceptionMessage(e);
        } finally{
            ps = null;
            con.desconectar();
        }
        
        return conf;

    }

    @Override
    public boolean eliminar(Empleado obj) {
        boolean conf = false;
        try {
            ps = con.conectar().prepareStatement("DELETE FROM empresa WHERE IDempleado = ?");
            ps.setInt(1, obj.getIDempleado());
            if(ps.executeUpdate() > 0){
                conf = true;
            }
        } catch (SQLException e) {
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            con.desconectar();
        }
        return conf;
    }

   
}