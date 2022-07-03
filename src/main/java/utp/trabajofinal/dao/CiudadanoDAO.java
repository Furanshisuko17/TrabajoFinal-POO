package utp.trabajofinal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.trabajofinal.entities.Ciudadano;
import utp.trabajofinal.ui.MainInterface;
import utp.trabajofinal.ui.MessageHandler;
import utp.trabajofinal.sqlhandler.ConnectionInfo;
import utp.trabajofinal.sqlhandler.MySQLHandler;
import utp.trabajofinal.crudInterfaces.ComplexCrudInterface;


public class CiudadanoDAO implements ComplexCrudInterface<Ciudadano> {
    
    private final ConnectionInfo connectionInfo;
    private final MySQLHandler con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CiudadanoDAO() {
        this.connectionInfo = MainInterface.connectionInfo;
        this.con = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
    }

    @Override
        public Object[] listar(String text) {
        List<Ciudadano> registros = new ArrayList();
        Object[] retorno = new Object[2];
        try{
            String queryString = 
                   "  SELECT  " +
                   "      IDciudadano,  " +
                   "      nombre,  " +
                   "      apellido,  " +
                   "      edad,  " +
                   "      DNI,  " +
                   "      ciudadano.IDzona, " +
                   "      ciudadano.IDcat, " +
                   "      ciudadano.IDempresa, " +
                   "      ciudadano.IDdesc, " +
                   "      zonas.nombreZona, " +
                   "      categoria.tipo,  " +
                   "      empresa.municipalNombre,  " +
                   "      descuentos.porcentajeDescuento " +
                   "  FROM  " +
                   "  	  ciudadano " +
                   "  		INNER JOIN  " +
                   "  	  categoria ON categoria.IDcat = ciudadano.IDcat " +
                   "  		INNER JOIN  " +
                   "  	  empresa ON empresa.IDempresa = ciudadano.IDempresa " +
                   "  		INNER JOIN  " +
                   "  	  descuentos ON descuentos.IDdesc = ciudadano.IDdesc " +
                   "  		INNER JOIN  " +
                   "  	  zonas ON zonas.IDzona = ciudadano.IDzona " +
                   "  WHERE  " +
                   "  	  IDciudadano " +
                   "  LIKE " +
                   "  	  ?;";
            
            ps = con.conectar().prepareStatement(queryString);
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            List<List<String>> textValues = new ArrayList();
            
            
            while(rs.next()){
                registros.add(new Ciudadano(rs.getString(1), 
                                            rs.getString(2),
                                            rs.getString(3),
                                            rs.getInt(4),
                                            rs.getInt(5),
                                            rs.getInt(6),
                                            rs.getInt(7),
                                            rs.getInt(8), 
                                            rs.getInt(9)));
                List<String> value = new ArrayList();
                
                value.add(rs.getString(10));
                value.add(rs.getString(11));
                value.add(rs.getString(12));
                value.add(rs.getString(13));
                textValues.add(value);
            }
            
            retorno[0] = registros;
            retorno[1] = textValues;
            ps.close();
            rs.close();
        }catch (SQLException e){
            MessageHandler.exceptionMessage(e);
        } finally {
            ps = null;
            rs = null;
            con.desconectar();
        }
        return retorno;
    }

    @Override
    public boolean insertar(Ciudadano obj) {
        return false;
    }

    @Override
    public boolean actualizar(Ciudadano obj) {
        return false;
    }

    @Override
    public boolean eliminar(Ciudadano obj) {
        return false;
    }
    

}
