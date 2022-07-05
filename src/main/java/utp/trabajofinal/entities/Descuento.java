package utp.trabajofinal.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Descuento {
    private int IDdesc;
    private int porcentajeDescuento;
    private Date fecha;
    private int cantidadBimestres;

    public Descuento(int IDdesc, int porcentajeDescuento, String fecha, int cantidadBimestres) throws ParseException {
        this.IDdesc = IDdesc;
        this.porcentajeDescuento = porcentajeDescuento;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        this.cantidadBimestres = cantidadBimestres;
    }
    
    public int getIDdesc() {
        return IDdesc;
    }

    public void setIDdesc(int IDdesc) {
        this.IDdesc = IDdesc;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getFecha() {
        return new SimpleDateFormat("dd/MM/yyyy").format(this.fecha);
    }

    public void setFecha(String fecha) throws ParseException {
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
    }

    public int getCantidadBimestres() {
        return cantidadBimestres;
    }

    public void setCantidadBimestres(int cantidadBimestres) {
        this.cantidadBimestres = cantidadBimestres;
    }
}
