package utp.trabajofinal.crudInterfaces;

import java.util.List;

public interface SimpleCrudInterface<T> {
    public List<T> listar(String text);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean eliminar(T obj);    
}
