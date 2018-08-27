package Entidades;

import Metodos.AMetodos;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Sector extends AMetodos
{
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
    public Sector(String descrip)
    {
        this.descripcion=descrip;
    }
    public Sector()
    {
        
    }
    public String agregar(String  e) throws Exception 
    {
        String resultado=" ";
        try
        {
          this.conectar();
          String sql="insert into "+this.getClass().getSimpleName()+"(descripcion) values(?)";
          PreparedStatement consulta= this.conexion.prepareStatement(sql);
          
          consulta.setString(1, e);
          consulta.executeUpdate();
          resultado="Especialidad ingresada exitosamente";
        }
        catch(Exception f)
        {
            System.out.println(f);
            resultado="Hubo un error en el ingreso de la especialidad";
        }
        finally
            {
                this.cerrar();
            }  
        return resultado;
    }
    public  void eliminarMetodoPropio(JTable Tabla,String tabla)
    {
        try
        {
        String pk=Tabla.getColumnName(0);
        String pk_dato= (String)Tabla.getModel().getValueAt(Tabla.getSelectedRow(), 0);
        String sql="delete from "+tabla;
        String where=" where "+pk+" LIKE "+"'"+pk_dato+"'";
        System.out.println("LA CONSULTA ES: "+sql+where);
          this.conectar();
          PreparedStatement consulta= this.conexion.prepareStatement(sql+where);       
          consulta.executeUpdate();
          JOptionPane.showMessageDialog(null,"Eliminado correctamente");
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,"Debe seleccionar una fila a eliminar");}             
        finally
            {
            try {
                this.cerrar();
            } catch (Exception ex) {
                Logger.getLogger(AMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
            }  
    }
}
