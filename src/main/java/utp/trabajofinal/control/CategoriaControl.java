package utp.trabajofinal.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import utp.trabajofinal.dao.CategoriaDAO;
import utp.trabajofinal.entities.Categoria;

public class CategoriaControl {
    private final CategoriaDAO data;
    private Categoria obj;
    private DefaultTableModel dtm;

    public CategoriaControl() {
        this.data = new CategoriaDAO();
        this.obj = new Categoria();
        
    }
    
    public DefaultTableModel listar(String text){
        List<Categoria> lista = new ArrayList();
        lista.addAll(data.listar(text));
        
        String[] columnas = {"ID", "Tipo", "Couta", "Ingresos máximos"};
        this.dtm = new DefaultTableModel(null, columnas);
        String[] registro = new String[4];
        
        for(Categoria item: lista){
            registro[0] = Integer.toString(item.getIDcat());
            registro[1] = item.getTipo();
            registro[2] = Integer.toString(item.getCuota());
            registro[3] = item.getIngresosMax();
            this.dtm.addRow(registro);
        }
        return this.dtm;
    }
    
    public String insertar(Categoria obj) {
        if (data.insertar(obj)) {
            return "OK";
        } else {
            return "Error en la inserción.";
        }
    }

    public String actualizar(Categoria obj) {
        if (data.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización.";
        }
    }
    public String eliminar(Categoria obj) {
        if (data.eliminar(obj)) {
            return "OK";
        } else {
            return "Error en la eliminación.";
        }
    }
    
    
    
}
