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
        List<List<String>> textColumns = new ArrayList(); //List contains list of textData
        
        Object[] objRetriever = data.listar(text);
        
        lista.addAll((Collection<? extends Ciudadano>) objRetriever[0]);
        textColumns.addAll((Collection<? extends List<String>>) objRetriever[1]);
          
        String[] columnas = {"ID", "Nombre", "Apellido", "Edad", "DNI", "Zona", "Categoría", "Nombre municipal", "Descuento"};
        
        this.dtm = new DefaultTableModel(null, columnas);
        
        String[] register = new String[9];
            int num = 0;
            for (Ciudadano item: lista){
                register[0] = item.getIDciudadano();
                register[1] = item.getNombre();
                register[2] = item.getApellido();
                register[3] = Integer.toString(item.getEdad());
                register[4] = Integer.toString(item.getDNI());
                for (int i = 0; i < textColumns.size(); i++) {
                    if(i == num){
                        register[5] = textColumns.get(i).get(0);
                        register[6] = textColumns.get(i).get(1);
                        register[7] = textColumns.get(i).get(2);
                        register[8] = textColumns.get(i).get(3);
                    }else if(i < num){
                        continue;
                    }else {
                        break;
                    }
                }
                this.dtm.addRow(register);
                num++;
            }      
        return this.dtm;
    }
    
}
