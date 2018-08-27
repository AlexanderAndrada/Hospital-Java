package Validaciones;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validar extends javax.swing.JFrame
{
    private char validar;
    private KeyEvent e;
    public Validar(KeyEvent e)
    {
        this.validar=e.getKeyChar();
        this.e=e;
    }
    public Validar()
    {
        
    }
    
    public void alerta()
    {
        getToolkit().beep();
        e.consume();
    }
    public void validarSoloNumeros()
    {
       if(!Character.isDigit(validar))
       {
           alerta();
           JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");      
       }
    }
    public void validarSoloLetras()
    {
        if(!Character.isSpaceChar(validar)&&!Character.isLetter(validar))
        {
            alerta();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }
    public void validarCantidadDigitoDni(JTextField dni)
    {
        if(dni.getText().length()==8)
        {
            alerta();
        }
    }
    public void validarCantidadDigitoEdad(JTextField edad)
    {
        if(edad.getText().length()==3)
        {
            alerta();
            JOptionPane.showMessageDialog(rootPane, "Limite 3 digitos");
        }
    } 
}