package utp.trabajofinal.control;

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

    
    
    
}
