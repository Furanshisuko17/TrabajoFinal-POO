package utp.trabajofinal.sqlhandler;

public class Demo {
    public static void main(String[] args) {
        char[] pass = new char[8];
        pass[0] = 'F';
        pass[1] = 'r';
        pass[2] = 'a';
        pass[3] = 'n';
        pass[4] = '1';
        pass[5] = '2';
        pass[6] = '3';
        pass[7] = '4';
        
        MySQLHandler cnx = MySQLHandler.getInstance("localhost", 3307, "arbitrios", "Fran", pass);
        
        cnx.conectar();
        if (cnx.cnx != null){
            System.out.println("Conexion exitosa");
        }else{
            System.out.println("Conexion falló");
        }
    }  
    
    
}
