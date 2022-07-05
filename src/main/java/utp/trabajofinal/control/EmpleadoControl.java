package utp.trabajofinal.control;

import javax.swing.table.DefaultTableModel;
import utp.trabajofinal.dao.EmpleadoDAO;
import utp.trabajofinal.entities.Empleado;
import java.util.ArrayList;
import java.util.List;
import utp.trabajofinal.dao.EmpleadoDAO;
public class EmpleadoControl {
    
    private final EmpleadoDAO data;
    private Empleado obj;
    private DefaultTableModel dtm;
    
    public EmpleadoControl(){
        this.data = new EmpleadoDAO();
        this.obj = new Empleado();
    }
    public DefaultTableModel listar(String text){
        List<Empleado> lista = new ArrayList();
        lista.addAll(data.listar(text));
        
        String[] columnas = {"ID", "Nombre ", "Apellido", "ID Zona", "ID Empresa", "ID Ciudadano"};
        this.dtm = new DefaultTableModel(null, columnas);
        String[] registro = new String[6];
        
        for(Empleado item: lista){
            registro[0] = Integer.toString(item.getIDempleado());
            registro[1] = item.getNombre();
            registro[2] = item.getApellido();
            registro[3] = Integer.toString(item.getIDzona());
            registro[4] = Integer.toString(item.getIDempresa());
            registro[5] = Integer.toString(item.getIDciudadano());
            
            this.dtm.addRow(registro);
        }
        return this.dtm;
    }
        public String insertar(Empleado obj) {
        if (data.insertar(obj)) {
            return "OK";
        } else {
            return "Error en la inserción.";
        }
    }

    public String actualizar(Empleado obj) {
        if (data.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización.";
        }
    }
    public String eliminar(Empleado obj) {
        if (data.eliminar(obj)) {
            return "OK";
        } else {
            return "Error en la eliminación.";
        }
    }


}

