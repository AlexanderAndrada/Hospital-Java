package Ventanas;

import Entidades.Clientes;
import Validaciones.Validar;

public class VClientesConsulta extends javax.swing.JFrame {

    Clientes c= new Clientes();
    public VClientesConsulta() {
        initComponents();
        Tabla.setVisible(true);
        Tabla.setModel(c.consultar("dni","Todos"));
        Tabla.setShowGrid(false);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        JBVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTFBusqueda = new javax.swing.JTextField();
        JLNombreColumna = new javax.swing.JLabel();
        JBBuscar = new javax.swing.JButton();
        JTFValorCambiar = new javax.swing.JTextField();
        JBModificar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos de los clientes");
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 500, -1));

        JBVolver.setText("Volver");
        JBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVolverActionPerformed(evt);
            }
        });
        getContentPane().add(JBVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        jLabel3.setText("Busqueda por DNI: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        JTFBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFBusquedaActionPerformed(evt);
            }
        });
        JTFBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFBusquedaKeyTyped(evt);
            }
        });
        getContentPane().add(JTFBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, -1));
        getContentPane().add(JLNombreColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 70, 20));

        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));
        getContentPane().add(JTFValorCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, -1));

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });
        getContentPane().add(JBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

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
        getContentPane().add(JBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fila.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConsultarActionPerformed
        Tabla.setVisible(true);
        Tabla.setModel(new Clientes().consultar("dni","Todos"));
    }//GEN-LAST:event_JBConsultarActionPerformed

    private void JBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVolverActionPerformed

    private void JTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFBusquedaActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        Tabla.setVisible(true);
        String dni=String.valueOf(JTFBusqueda.getText());
        Tabla.setShowGrid(false);
        Tabla.setModel(c.consultar("dni",dni));
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        String celda=(String) Tabla.getModel().getValueAt(Tabla.getSelectedRow(), Tabla.getSelectedColumn());
       JLNombreColumna.setText(Tabla.getColumnName(Tabla.getSelectedColumn()));
       JTFValorCambiar.setText(celda);
    }//GEN-LAST:event_TablaMouseClicked

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        String clase=c.getClass().getSimpleName();       
        c.modificar(Tabla,clase, JTFValorCambiar.getText());    
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        c.eliminar(Tabla,c.getClass().getSimpleName()); 
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBEliminarMouseClicked

    private void JTFBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBusquedaKeyPressed
   
    }//GEN-LAST:event_JTFBusquedaKeyPressed

    private void JTFBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBusquedaKeyTyped
        Validar v=new Validar(evt);
        v.validarSoloNumeros();
        v.validarCantidadDigitoDni(JTFBusqueda);
    }//GEN-LAST:event_JTFBusquedaKeyTyped

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
            java.util.logging.Logger.getLogger(VClientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VClientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VClientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VClientesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VClientesConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBConsultar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBVolver;
    private javax.swing.JLabel JLNombreColumna;
    private javax.swing.JTextField JTFBusqueda;
    private javax.swing.JTextField JTFValorCambiar;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
