package Entidades;

import Metodos.AMetodos;
import java.sql.PreparedStatement;

public class Medicos extends AMetodos
{
    private int matricula;
    String nombre,apellido, especialidad;
    public Medicos(int matricula,String nombre, String apellido, String especialidad)
    {
        this.matricula=matricula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.especialidad=especialidad;
    }
    public Medicos()
    {
        
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public String agregar(int  matricula, String nombre, String apellido, String especialidad) throws Exception 
    {
        String resultado=" ";
        try
        {
          this.conectar();
          String sql="insert into "+this.getClass().getSimpleName()+"(matricula, nombre, apellido, especialidad) values(?,?,?,?)";
          PreparedStatement consulta= this.conexion.prepareStatement(sql);
          
          consulta.setInt(1, matricula);
          consulta.setString(2, nombre);
          consulta.setString(3, apellido);
          consulta.setString(4, especialidad);
          consulta.executeUpdate();
          resultado="Profesional ingresado exitosamente";
        }
        catch(Exception f)
        {
            System.out.println(f);
            resultado="Hubo un error en el ingreso del profesional";
        }
        finally
            {
                this.cerrar();
            }  
        return resultado;
    }
}
