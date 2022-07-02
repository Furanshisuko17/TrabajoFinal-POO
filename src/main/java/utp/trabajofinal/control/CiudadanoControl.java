package utp.trabajofinal.control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import utp.trabajofinal.dao.CiudadanoDAO;
import utp.trabajofinal.entities.Ciudadano;

public class CiudadanoControl {
    private final CiudadanoDAO data;
    private Ciudadano obj;
    private DefaultTableModel dtm;
    
    public CiudadanoControl(){
        this.data = new CiudadanoDAO();
        this.obj = new Ciudadano();
    }
    
    public DefaultTableModel listar(String text) {
        List<Ciudadano> lista = new ArrayList(); // List contains Ciudadano objects
        List<List<String>> textColumns = new ArrayList(); //
        
        Object[] objRetriever = data.listar(text);
        
        lista.addAll((Collection<? extends Ciudadano>) objRetriever[0]);
        textColumns.addAll((Collection<? extends List<String>>) objRetriever[1]);
          
        
        String[] columnas = {"ID", "Nombre", "Apellido", "Edad", "DNI", "zona", "IDcat", "IDmuni", ""};
        this.dtm = new DefaultTableModel(null, columnas);
        
        String[] register = new String[8];
        
        for (Ciudadano item : lista){
            register[0] = item.getIDciudadano();
            register[1] = item.getNombre();
            register[2] = item.getApellido();
            register[3] = Integer.toString(item.getEdad());
            register[4] = Integer.toString(item.getDNI());
            register[5] = Integer.toString(item.getIDzona());
            register[6] = Integer.toString(item.getIDcat());
            register[7] = Integer.toString(item.getIDempresa());
            this.dtm.addRow(register);
        }
        
        
        return this.dtm;
    }
    
}
