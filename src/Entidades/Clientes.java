package Entidades;
import Metodos.AMetodos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Clientes extends AMetodos
{
    public Clientes()
    {
        
    }
    
    public void modificar() 
    {
       System.out.println();
    }

    //@Override
    public String agregar(int dni,String nombre,String apellido, String localidad, int edad, String fnac, String sexo) throws Exception 
    {
        String resultado=" ";
        try
        {
          this.conectar();
          String sql="insert into "+this.getClass().getSimpleName()+"(dni,nombre,apellido,localidad,edad,fnac,sexo) values(?,?,?,?,?,?,?)";
          PreparedStatement consulta= this.conexion.prepareStatement(sql);
          
          consulta.setInt(1, dni);
          consulta.setString(2, nombre);
          consulta.setString(3, apellido);
          consulta.setString(4,localidad);
          consulta.setInt(5, edad);
          consulta.setString(6,fnac );
          consulta.setString(7, sexo);
          consulta.executeUpdate();
          resultado="Cliente ingreso exitosamente";
        }
        catch(Exception e)
        {
            System.out.println(e);
            resultado="Hubo un error en el ingreso del cliente";
        }
        finally
            {
                this.cerrar();
            }  
        return resultado;
    }   
}