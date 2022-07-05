package utp.trabajofinal.entities;

public class Empleado {
    private int IDempleado;
    private String nombre;
    private String apellido;
    private int IDzona;
    private int IDempresa;
    private int IDciudadano;
  
    public Empleado() {
    }

    public Empleado(int IDempleado, String nombre, String apellido, int IDzona, int IDempresa, int IDciudadano) {
        this.IDempleado = IDempleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.IDzona = IDzona;
        this.IDempresa = IDempresa;
        this.IDciudadano = IDciudadano;
    }


    public int getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(int IDempleado) {
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

    public int getIDzona() {
        return IDzona;
    }

    public void setIDzona(int IDzona) {
        this.IDzona = IDzona;
    }

    public int getIDempresa() {
        return IDempresa;
    }

    public void setIDempresa(int IDempresa) {
        this.IDempresa = IDempresa;
    }

    public int getIDciudadano() {
        return IDciudadano;
    }

    public void setIDciudadano(int IDciudadano) {
        this.IDciudadano = IDciudadano;
    }
    
    
}
