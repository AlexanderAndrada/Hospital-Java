package Metodos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface IMetodos 
{
    public void modificar(JTable Tabla, String clase, String dato);
    public void eliminar(JTable Tabla,String tabla);
    public DefaultTableModel consultar(String variable,String busqueda);
}