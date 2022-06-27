package utp.trabajofinal.sqlhandler;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utp.trabajofinal.ui.MessageHandler;

//Singleton class
public class MySQLHandler {
    
    private final String URL;
    private final String BD;
    private final String USER;
    private final char[] PASSWORD;
    
    public Connection cnx;
    private static volatile MySQLHandler selfinstance;
    
    private MySQLHandler(String ip, int port, String database, String user, char[] password) {
        
        this.URL = "jdbc:mysql://" + ip + ":" + port + "/";
        this.BD = database;
        this.USER = user;
        this.PASSWORD = password;
        this.cnx = null;
    }
      
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.cnx = DriverManager.getConnection(URL + BD, USER, String.valueOf(PASSWORD));
        }catch (ClassNotFoundException e){
            MessageHandler.exceptionMessage(e, MessageHandler.EXCEPTION_TITLE,"Driver no encontrado!");
        }catch (SQLException e){
            MessageHandler.exceptionMessage(e, "Error al conectar!");
        }
        return this.cnx;
    }
    
    public void desconectar() {
        try {
            this.cnx.close();
        } catch (SQLException e){
            MessageHandler.exceptionMessage(e, "Error al desconectar!");
        }
    }
    
    public static boolean isConnected(){
        if(selfinstance == null) {
            return false;
        }
        return true;
    }
    
    //"Constructor"
    public static MySQLHandler getInstance(String ip, int port, String database, String user, char[] password){
        
        MySQLHandler result = selfinstance;
        if (result != null) {
            return result;
        }
        synchronized(MySQLHandler.class){
            if(selfinstance == null){
                selfinstance = new MySQLHandler(ip, port, database, user, password);       
            }   
            return selfinstance;
        }
            
    }
    
    synchronized public static void clearInstance(){
        selfinstance = null;
    }
    
    @Override 
    public String toString() {
        try {
            DatabaseMetaData metadata =  cnx.getMetaData();
            System.out.println("Username: " + metadata.getUserName());
            System.out.println("URL: " + metadata.getURL());
            String info = "Username: " + metadata.getUserName() +
"                        \nURL: " + metadata.getURL();
            return info;
        } catch (SQLException ex) {
            MessageHandler.exceptionMessage(ex, "");
            Logger.getLogger(MySQLHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "? error";
    }
}
