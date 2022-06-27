
package utp.trabajofinal.sqlhandler;

public class ConnectionInfo {
    
    private int port;
    private String IP;
    private String user; ;
    private char[] password;
    private String database;
    
    public ConnectionInfo(){
        
    }
    
    public ConnectionInfo(int port, String IP, String user, char[] password, String database){
        this.port = port;
        this.IP = IP;
        this.user = user;
        this.password = password;
        this.database = database;
    }
    
    public void clearData(){
        this.port = 0;
        this.IP = "";
        this.user = "";
        for(int i = 0; i < this.password.length; i++){
            this.password[i] = '0';
        }
        this.database = "";
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
    

}
