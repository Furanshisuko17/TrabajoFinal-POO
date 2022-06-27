package utp.trabajofinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.trabajofinal.crudInterfaces.SimpleCrudInterface;
import utp.trabajofinal.entities.Municipalidad;
import utp.trabajofinal.ui.MainInterface;
import utp.trabajofinal.ui.MessageHandler;
import utp.trabajofinal.sqlhandler.ConnectionInfo;
import utp.trabajofinal.sqlhandler.MySQLHandler;


public class MunicipalidadDAO implements SimpleCrudInterface<Municipalidad> {
    
    private final ConnectionInfo connectionInfo;
    private final MySQLHandler con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public MunicipalidadDAO() {
        this.connectionInfo = MainInterface.connectionInfo;
        this.con = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
    }

    @Override
    public List<Municipalidad> listar(String text) {
        List<Municipalidad> registros = new ArrayList();
        try{
            ps = con.conectar().prepareStatement("SELECT * FROM municipalidad WHERE IDempleado LIKE ?");
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Municipalidad(rs.getString(1), 
                                                rs.getString(2),
                                                rs.getString(3),
                                                rs.getInt(4),
                                                rs.getInt(5),
                                                rs.getInt(6),
                                                rs.getInt(7),
                                                rs.getInt(8)));
            }
            ps.close();
            rs.close();
        }catch (SQLException e){
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            rs = null;
            con.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(Municipalidad obj) {
        return true;
    }

    @Override
    public boolean actualizar(Municipalidad obj) {
        return true;
    }

    @Override
    public boolean eliminar(Municipalidad obj) {
        return true;
    }
    

}
