package Ventanas;

import Entidades.Medicos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VMedicos extends javax.swing.JFrame {


    public VMedicos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLEspecialidad = new javax.swing.JList<>();
        JBGuardar = new javax.swing.JButton();
        JBVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Profesional");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingreso de Profesional");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Matricula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));
        getContentPane().add(JTFMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 72, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));
        getContentPane().add(JTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 72, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, -1, -1));
        getContentPane().add(JTFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 72, -1));

        jLabel5.setText("Especialidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 51, -1, -1));

        JLEspecialidad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cardiologia", "Neumonologia", "Clinica Medica", "Oncologia", "Traumatologia", "Pediatria", "Cirugia", "Nefronologia" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JLEspecialidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 71, -1, -1));

        JBGuardar.setText("Guardar");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(JBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 48));

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingreso_medico.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        try {
            int matricula=Integer.parseInt(this.JTFMatricula.getText());
        String nombre=this.JTFNombre.getText();
        String apellido=this.JTFApellido.getText();
        String especialidad=this.JLEspecialidad.getSelectedValue();
            JOptionPane.showMessageDialog(null,new Medicos().agregar(matricula, nombre, apellido, especialidad));
        } catch (Exception ex) {
            Logger.getLogger(VMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBVolver;
    private javax.swing.JList<String> JLEspecialidad;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFMatricula;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
