package Entidades;

import Metodos.AMetodos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Especialidad extends AMetodos
{
    private String descripcion;

    public String getDescripcion() 
    {
        return descripcion;
    }

    public Connection getConexion() {
        return conexion;
    }
    public void agregar(String  e) throws Exception 
    {
        try
        {
          this.conectar();
          String sql="insert into "+this.getClass().getSimpleName()+"(descripcion) values(?)";
          PreparedStatement consulta= this.conexion.prepareStatement(sql);
          
          consulta.setString(1, e);
          consulta.executeUpdate();
          JOptionPane.showMessageDialog(null,"Especialidad ingresada exitosamente");
        }
        catch(Exception f)
        {
            System.out.println(f);
            JOptionPane.showMessageDialog(null, "Hubo un error en el ingreso de la especialidad");
        }
        finally
            {
                this.cerrar();
            }  
    }     
}