
package utp.trabajofinal.dao;

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


public class EmpresaDAO implements SimpleCrudInterface<Empresa>{
    
    private final ConnectionInfo connectionInfo;
    private final MySQLHandler con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public EmpresaDAO(){
        this.connectionInfo = MainInterface.connectionInfo;
        this.con = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
    }

    @Override
    public List<Empresa> listar(String text) {
        List<Empresa> registros = new ArrayList();
        try{
            ps = con.conectar().prepareStatement("SELECT * FROM empresa WHERE municipalNombre LIKE ?;");
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Empresa(rs.getInt(1),
                                          rs.getString(2),
                                          rs.getString(3)));
            }
            
            ps.close();
            rs.close();
        }catch (SQLException e){
            MessageHandler.exceptionMessage(e);
        }finally {
            ps = null;
            rs = null;
            con.desconectar(); 
        }
        return registros;
    }

    @Override
    public boolean insertar(Empresa obj) {
        boolean conf = false;
        try{
            ps = con.conectar().prepareStatement("INSERT INTO empresa (municipalNombre, lugar) VALUES (?, ?)");
            ps.setString(1, obj.getMunicipalNombre());
            ps.setString(2, obj.getLugar());
            if(ps.executeUpdate() > 0){
                conf = true;
            }
            ps.close();
        }catch (SQLException e){
            MessageHandler.exceptionMessage(e);
        }finally {
            ps = null;
            con.desconectar();
        }
        return conf;
    }

    @Override
    public boolean actualizar(Empresa obj) {
        boolean conf = false;
        try{
            ps = con.conectar().prepareStatement("UPDATE empresa SET municipalNombre = ?, lugar = ? WHERE IDempresa = ?");
            ps.setString(1, obj.getMunicipalNombre());
            ps.setString(1, obj.getLugar());
            ps.setInt(1, obj.getIDempresa());
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
    public boolean eliminar(Empresa obj) {
        boolean conf = false;
        try {
            ps = con.conectar().prepareStatement("DELETE FROM empresa WHERE IDempresa = ?");
            ps.setInt(1, obj.getIDempresa());
            if(ps.executeUpdate() > 0){
                conf = true;
            }
            
        }catch (SQLException e) {
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            con.desconectar();
        }
        return conf;
    }
}
