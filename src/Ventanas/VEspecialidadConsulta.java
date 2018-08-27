package Ventanas;

import Entidades.*;
import Validaciones.Validar;

public class VEspecialidadConsulta extends javax.swing.JFrame {

    Especialidad e= new Especialidad();
    public VEspecialidadConsulta() {
        initComponents();
        Tabla.setVisible(true);
        Tabla.setModel(e.consultar("especialidad","Todos"));
        Tabla.setShowGrid(false);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        JLNombreColumna = new javax.swing.JLabel();
        JBVolver = new javax.swing.JButton();
        JTFValorCambiar = new javax.swing.JTextField();
        JBModificar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos de las especialidades");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        JBConsultar.setText("Actualizar");
        JBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(JBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBorder(new javax.swing.border.MatteBorder(null));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));
        getContentPane().add(JLNombreColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 20));

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));
        getContentPane().add(JTFValorCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });
        getContentPane().add(JBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        JBEliminar.setText("Eliminar");
        JBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBEliminarMouseClicked(evt);
            }
        });
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(JBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esp.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultarActionPerformed
        Tabla.setVisible(true);
        Tabla.setModel(e.consultar("especialidad","Todos"));
    }//GEN-LAST:event_JBConsultarActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVolverActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        String celda=(String) Tabla.getModel().getValueAt(Tabla.getSelectedRow(), Tabla.getSelectedColumn());
       JLNombreColumna.setText(Tabla.getColumnName(Tabla.getSelectedColumn()));
       JTFValorCambiar.setText(celda);
    }//GEN-LAST:event_TablaMouseClicked

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        String clase=e.getClass().getSimpleName();       
        e.modificar(Tabla,clase, JTFValorCambiar.getText());    
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        e.eliminarMetodoPropio(Tabla,e.getClass().getSimpleName()); 
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBEliminarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VEspecialidadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEspecialidadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEspecialidadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEspecialidadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEspecialidadConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConsultar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBVolver;
    private javax.swing.JLabel JLNombreColumna;
    private javax.swing.JTextField JTFValorCambiar;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
