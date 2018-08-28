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
}