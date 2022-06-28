package utp.trabajofinal.entities;

public class Empresa {
    
    private int IDempresa;
    private String municipalNombre;
    private String lugar;
    
    public Empresa(){        
    }

    public Empresa(int IDempresa, String municipalNombre, String lugar) {
        this.IDempresa = IDempresa;
        this.municipalNombre = municipalNombre;
        this.lugar = lugar;
    }

    public int getIDempresa() {
        return IDempresa;
    }

    public void setIDempresa(int IDempresa) {
        this.IDempresa = IDempresa;
    }

    public String getMunicipalNombre() {
        return municipalNombre;
    }

    public void setMunicipalNombre(String municipalNombre) {
        this.municipalNombre = municipalNombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
