package Conexion_DB;
import java.sql.*;


public class Conexion 
{
    protected Connection conexion;
    //RUTA Y DATABASE
    final String JDCB_DRIVER = "org.postgresql.Driver";
    final String DB_URL= "jdbc:postgresql://localhost:5432/Hospital";
    //DATOS
    final String USER= "postgres";
    final String PASS="1234";

    public Connection getConexion() {
        return conexion;
    }
    
public void conectar() throws Exception
{
    try
    {
        conexion= DriverManager.getConnection(DB_URL, USER, PASS);
        Class.forName(JDCB_DRIVER);
       // PreparedStatement st=conexion.prepareStatement("select * from Clientes");
    }
    catch(Exception e){}
}
public void cerrar() throws Exception
{
    try
    {
    if(conexion !=null)
    {
        if(!conexion.isClosed())
        {
            conexion.close();
        }
    }
    }
    catch(Exception e){}
}
}