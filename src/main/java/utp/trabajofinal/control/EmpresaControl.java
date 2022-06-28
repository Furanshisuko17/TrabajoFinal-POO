package utp.trabajofinal.control;

import javax.swing.table.DefaultTableModel;
import utp.trabajofinal.dao.EmpresaDAO;
import utp.trabajofinal.entities.Empresa;
import java.util.ArrayList;
import java.util.List;

public class EmpresaControl {
    private final EmpresaDAO data;
    private Empresa obj;
    private DefaultTableModel dtm;
    
    public EmpresaControl(){
        this.data = new EmpresaDAO();
        this.obj = new Empresa();
    }
    
    public DefaultTableModel listar(String text){
        List<Empresa> lista = new ArrayList();
        lista.addAll(data.listar(text));
        
        String[] columnas = {"ID", "Nombre municipal", "Lugar"};
        this.dtm = new DefaultTableModel(null, columnas);
        String[] registro = new String[3];
        String estado;
        
        for(Empresa item: lista){
            registro[0] = Integer.toString(item.getIDempresa());
            registro[1] = item.getMunicipalNombre();
            registro[2] = item.getLugar();
            this.dtm.addRow(registro);
        }
        return this.dtm;
    }
    
    public String insertar(Empresa obj) {
        if (data.insertar(obj)) {
            return "OK";
        } else {
            return "Error en la inserción.";
        }
    }

    public String actualizar(Empresa obj) {
        if (data.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización.";
        }
    }
    public String eliminar(Empresa obj) {
        if (data.eliminar(obj)) {
            return "OK";
        } else {
            return "Error en la eliminación.";
        }
    }
}
