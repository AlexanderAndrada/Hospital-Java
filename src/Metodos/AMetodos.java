package Metodos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import Conexion_DB.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class AMetodos extends Conexion implements IMetodos
{
      public DefaultTableModel consultar(String variable,String busqueda)
        {
            DefaultTableModel modelo=new DefaultTableModel();
            try
                {   
                    this.conectar(); //conexion
                    PreparedStatement st=conexion.prepareStatement("select * from "+this.getClass().getSimpleName());//consulta
                    if(!busqueda.equals("Todos"))
                        {
                            st=conexion.prepareStatement("select * from "+this.getClass().getSimpleName()+" where " +variable+" = "+busqueda);//consulta
                        }
                    ResultSet consulta=st.executeQuery();
                    ResultSetMetaData data= consulta.getMetaData();//DATOS DE LA TABLA
                    int cantCol=data.getColumnCount(); //CANTIDAD DE COLUMNAS SEGUN TABLA
                    for(int i=1;i<=cantCol;i++)
                    {
                        modelo.addColumn(data.getColumnName(i));//DA NOMBRE A LAS COLUMNAS
                    }
                    while(consulta.next())// cada consulta es una fila
                        {
                            String fila[]=new String[cantCol];//VECTOR DE STRING FILAS
                            for(int e=0;e<cantCol;e++)
                            {
                                fila[e]=consulta.getString(e+1); // cada dato de una fila guardado en un vector
                                System.out.println(fila[e]);
                            }
                            modelo.addRow(fila); // agrega el vector en una fila del modelo   
                        } 
                }
                catch(Exception e){}
                    finally{
                            try {
                            this.cerrar();
                                } 
                                catch (Exception ex) 
                                {
                                Logger.getLogger(AMetodos.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
        return modelo; 
        }

    public  void modificar(JTable Tabla,String clase, String dato)
    {
        try
        {
            String columna=Tabla.getColumnName(Tabla.getSelectedColumn());
            String colPK=Tabla.getColumnName(0);
            String pk_dato=(String)Tabla.getModel().getValueAt(Tabla.getSelectedRow(), 0);
            dato="'"+dato+"'";
            String sql="update "+clase+" set "+columna+" = "+dato;
            String where=" where "+colPK+" = "+pk_dato;
             this.conectar();
            PreparedStatement consulta= this.conexion.prepareStatement(sql+where);
            consulta.executeUpdate();
            JOptionPane.showMessageDialog(null,"Modificación correcta");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error en la modificación");
        }
        finally
            {
            try {
                this.cerrar();
            } catch (Exception ex) {}
            }  
    }
    
    public  void agregar()
    {}
    public  void eliminar(JTable Tabla,String tabla)
    {
        try
        {
        String pk=Tabla.getColumnName(0);
        String pk_dato= (String)Tabla.getModel().getValueAt(Tabla.getSelectedRow(), 0);
        String sql="delete from "+tabla;
        String where=" where "+pk+" = "+pk_dato;
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
