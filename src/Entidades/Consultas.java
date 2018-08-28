package Entidades;

import Metodos.AMetodos;
import java.sql.PreparedStatement;


public class Consultas extends AMetodos
{
    private int dni, medico;
    private String horario, sector, fecha;
    public Consultas(int dni,String fecha,String horario, int  medico, String sector)
    {
        this.dni=dni;
        this.fecha=fecha;
        this.horario=horario;
        this.medico=medico;
        this.sector=sector;
        
    }
    public Consultas()
    {
        
    }

    public int getDni() {
        return dni;
    }

    public int getMedico() {
        return medico;
    }

    public String getHorario() {
        return horario;
    }

    public String getSector() {
        return sector;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void guardarConsultas() throws Exception
    {
        try
        {
          this.conectar();
          String sql="insert into consultas(dni,fecha,horario,medico, sector) values(?,?,?,?,?)";
          PreparedStatement consulta= this.conexion.prepareStatement(sql);
          
          consulta.setInt(1, this.getDni());
          consulta.setString(2, this.getFecha());
          consulta.setString(3, this.getHorario());
          consulta.setInt(4,this.getMedico());
          consulta.setString(5, this.getSector());
          consulta.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
            {
                this.cerrar();
            }
    }
}