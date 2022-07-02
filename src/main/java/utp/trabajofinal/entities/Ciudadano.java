package utp.trabajofinal.entities;

public class Ciudadano {

    private String IDciudadano;
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private int IDzona;
    private int IDcat;
    private int IDempresa;
    private int IDdesc;

    public Ciudadano(String IDciudadano, String nombre, String apellido, int edad, int DNI, int IDzona, int IDcat, int IDempresa, int IDdesc) {
        this.IDciudadano = IDciudadano;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.IDzona = IDzona;
        this.IDcat = IDcat;
        this.IDempresa = IDempresa;
        this.IDdesc = IDdesc;
    }

    public Ciudadano() {
    }
   
    public String getIDciudadano() {
        return IDciudadano;
    }

    public void setIDciudadano(String IDciudadano) {
        this.IDciudadano = IDciudadano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getIDzona() {
        return IDzona;
    }

    public void setIDzona(int IDzona) {
        this.IDzona = IDzona;
    }

    public int getIDcat() {
        return IDcat;
    }

    public void setIDcat(int IDcat) {
        this.IDcat = IDcat;
    }

    public int getIDempresa() {
        return IDempresa;
    }

    public void setIDempresa(int IDempresa) {
        this.IDempresa = IDempresa;
    }
    
    public int getIDdesc() {
        return IDdesc;
    }

    public void setIDdesc(int IDdesc) {
        this.IDdesc = IDdesc;
    }
}
