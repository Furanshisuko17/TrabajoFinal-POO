package utp.trabajofinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utp.trabajofinal.crudInterfaces.SimpleCrudInterface;
import utp.trabajofinal.entities.Categoria;
import utp.trabajofinal.sqlhandler.ConnectionInfo;
import utp.trabajofinal.sqlhandler.MySQLHandler;
import utp.trabajofinal.ui.MainInterface;
import utp.trabajofinal.ui.MessageHandler;

public class CategoriaDAO implements SimpleCrudInterface<Categoria>{
    
    private final ConnectionInfo connectionInfo;
    private final MySQLHandler con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CategoriaDAO() {
        this.connectionInfo = MainInterface.connectionInfo;
        this.con = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
    }

    @Override
    public List<Categoria> listar(String text) {
        List<Categoria> registros = new ArrayList();
        try {            
            ps = con.conectar().prepareStatement("SELECT * FROM categoria WHERE IDcat LIKE ?;");
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                registros.add(new Categoria(rs.getInt(1),
                                          rs.getString(2),
                                          rs.getInt(3),
                                          rs.getString(4)));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            MessageHandler.exceptionMessage(ex);
        } finally {
            ps = null;
            rs = null;
            con.desconectar(); 
        }
        return registros;
    }

    @Override
    public boolean insertar(Categoria obj) {
        boolean conf = false;
        try {
            ps = con.conectar().prepareStatement("INSERT INTO categoria (tipo, couta, ingresosMax) VALUES (?, ?, ?)");
            ps.setString(1, obj.getTipo());
            ps.setInt(2, obj.getCuota());
            ps.setString(3, obj.getIngresosMax());
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
    public boolean actualizar(Categoria obj) {
        boolean conf = false;
        try{
            ps = con.conectar().prepareStatement("UPDATE categoria SET tipo = ?, couta = ?, ingresosMax = ? WHERE IDcat = ?");
            ps.setString(1, obj.getTipo());
            ps.setInt(2, obj.getCuota());
            ps.setString(3, obj.getIngresosMax());
            ps.setInt(4, obj.getIDcat());
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
    public boolean eliminar(Categoria obj) {
        boolean conf = false;
        try {
            ps = con.conectar().prepareStatement("DELETE FROM categoria WHERE IDcat = ?");
            ps.setInt(1, obj.getIDcat());
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
