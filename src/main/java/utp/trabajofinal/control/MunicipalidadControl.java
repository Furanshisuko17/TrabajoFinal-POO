package utp.trabajofinal.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import utp.trabajofinal.dao.MunicipalidadDAO;
import utp.trabajofinal.entities.Municipalidad;

public class MunicipalidadControl {
    private final MunicipalidadDAO data;
    private Municipalidad obj;
    private DefaultTableModel dtm;
    
    public MunicipalidadControl(){
        this.data = new MunicipalidadDAO();
        this.obj = new Municipalidad();
    }
    
    public DefaultTableModel listar(String text) {
        List<Municipalidad> lista = new ArrayList();
        lista.addAll(data.listar(text));
        String[] columnas = {"IDempleado", "Nombre", "Apellido", "Edad", "DNI", "zona", "IDcat", "IDmuni"};
        this.dtm = new DefaultTableModel(null, columnas);
        String[] register = new String[8];
        for (Municipalidad item : lista){
            register[0] = item.getIDempleado();
            register[1] = item.getNombre();
            register[2] = item.getApellido();
            register[3] = Integer.toString(item.getEdad());
            register[4] = Integer.toString(item.getDNI());
            register[5] = Integer.toString(item.getZona());
            register[6] = Integer.toString(item.getIDcat());
            register[7] = Integer.toString(item.getIDmuni());
            this.dtm.addRow(register);
        }
        return this.dtm;
    }
    
}
