package utp.trabajofinal.entities;

public class Categoria {
    
    private int IDcat;
    private String tipo;
    private int cuota;
    private String ingresosMax;

    public Categoria(int IDcat, String tipo, int cuota, String ingresosMax) {
        this.IDcat = IDcat;
        this.tipo = tipo;
        this.cuota = cuota;
        this.ingresosMax = ingresosMax;
    }

    public Categoria() {
        
    }

    public int getIDcat() {
        return IDcat;
    }

    public void setIDcat(int IDcat) {
        this.IDcat = IDcat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getIngresosMax() {
        return ingresosMax;
    }

    public void setIngresosMax(String ingresosMax) {
        this.ingresosMax = ingresosMax;
    }
    
}
