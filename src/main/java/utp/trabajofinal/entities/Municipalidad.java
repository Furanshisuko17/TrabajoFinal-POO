package utp.trabajofinal.entities;

public class Municipalidad {

    private String IDempleado;
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private int zona;
    private int IDcat;
    private int IDmuni;

    public Municipalidad() {
    }

    public Municipalidad(String IDempleado, String nombre, String apellido, int edad, int DNI, int zona, int IDcat, int IDmuni) {
        this.IDempleado = IDempleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.zona = zona;
        this.IDcat = IDcat;
        this.IDmuni = IDmuni;
    }
    
    public String getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(String IDempleado) {
        this.IDempleado = IDempleado;
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

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getIDcat() {
        return IDcat;
    }

    public void setIDcat(int IDcat) {
        this.IDcat = IDcat;
    }

    public int getIDmuni() {
        return IDmuni;
    }

    public void setIDmuni(int IDmuni) {
        this.IDmuni = IDmuni;
    }
    
}
