package Ventanas;

import Entidades.Clientes;
import Validaciones.Validar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VClientes extends javax.swing.JFrame {

    Clientes c=new Clientes();
    public VClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JTFDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFLocalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTFEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTFDia = new javax.swing.JTextField();
        JTFMes = new javax.swing.JTextField();
        JTFAño = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JCBSexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Cliente");
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nuevo Cliente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.jpg"))); // NOI18N

        JTFDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDniActionPerformed(evt);
            }
        });
        JTFDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFDniKeyTyped(evt);
            }
        });

        jLabel3.setText("DNI");

        jLabel4.setText("Nombre");

        JTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFNombreKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellido");

        JTFApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFApellidoKeyTyped(evt);
            }
        });

        jLabel6.setText("Localidad");

        JTFLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFLocalidadActionPerformed(evt);
            }
        });
        JTFLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFLocalidadKeyTyped(evt);
            }
        });

        jLabel7.setText("Edad");

        JTFEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFEdadKeyTyped(evt);
            }
        });

        jLabel8.setText("Fecha de Nacimiento");

        JTFDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDiaActionPerformed(evt);
            }
        });

        JTFMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMesActionPerformed(evt);
            }
        });

        JTFAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAñoActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo");

        JCBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JBGuardar.setText("GUARDAR");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTFDia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFMes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFAño))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(70, 70, 70)
                        .addComponent(JBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JTFDni)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(JTFNombre)
                                .addComponent(jLabel5)
                                .addComponent(JTFApellido)
                                .addComponent(jLabel6)
                                .addComponent(JTFLocalidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTFEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(JBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFLocalidadActionPerformed

    private void JTFDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDiaActionPerformed

    private void JTFMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFMesActionPerformed

    private void JTFAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAñoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
            int dni=Integer.parseInt(JTFDni.getText());
            String nombre= JTFNombre.getText();
            String apellido= JTFApellido.getText();
            String localidad= JTFLocalidad.getText();
            int edad=Integer.parseInt(JTFEdad.getText());
            String sexo= JCBSexo.getName();
            String fnac= JTFDia.getText()+"/"+JTFMes.getText()+"/"+JTFAño.getText();
        
        try {
            c.agregar(dni, nombre,apellido, localidad, edad,  fnac, sexo);
        } catch (Exception ex) {
            Logger.getLogger(VClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JTFDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDniActionPerformed

    private void JTFDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDniKeyTyped
        Validar v= new Validar(evt);
        v.validarSoloNumeros();
        v.validarCantidadDigitoDni(JTFDni);
        
    }//GEN-LAST:event_JTFDniKeyTyped

    private void JTFNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNombreKeyTyped
        new Validar(evt).validarSoloLetras();
    }//GEN-LAST:event_JTFNombreKeyTyped

    private void JTFApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFApellidoKeyTyped
        new Validar(evt).validarSoloLetras();
    }//GEN-LAST:event_JTFApellidoKeyTyped

    private void JTFLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFLocalidadKeyTyped
        Validar v=new Validar(evt);
        v.validarSoloLetras();
    }//GEN-LAST:event_JTFLocalidadKeyTyped

    private void JTFEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFEdadKeyTyped
        Validar v=new Validar(evt);
        v.validarSoloNumeros();
        v.validarCantidadDigitoEdad(JTFEdad);
    }//GEN-LAST:event_JTFEdadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBGuardar;
    private javax.swing.JComboBox<String> JCBSexo;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFAño;
    private javax.swing.JTextField JTFDia;
    private javax.swing.JTextField JTFDni;
    private javax.swing.JTextField JTFEdad;
    private javax.swing.JTextField JTFLocalidad;
    private javax.swing.JTextField JTFMes;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
