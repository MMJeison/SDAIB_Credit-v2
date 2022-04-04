/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.vista;

import javax.swing.JOptionPane;
import sdaib_credit.controlador.HabInhabUsersControlador;
import sdaib_credit.modelo.Usuario;

/**
 *
 * @author User
 */
public class UIActDesacUsuarios extends javax.swing.JPanel {
    private HabInhabUsersControlador habInhabUsersControlador;
    /**
     * Creates new form UIActDesacUsuarios
     */
    public UIActDesacUsuarios(HabInhabUsersControlador habInhabUsersControlador) {
        initComponents();
        this.habInhabUsersControlador = habInhabUsersControlador;
        limpiarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_IngrUsername = new javax.swing.JTextField();
        btn_Consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_EstadoCuenta = new javax.swing.JLabel();
        lbl_Username = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_Identificacion = new javax.swing.JLabel();
        btn_CambiarEstado = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese el username:");

        tf_IngrUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_IngrUsername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tf_IngrUsernameCaretUpdate(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Identificacion");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Username");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Estado de cuenta:");
        jLabel5.setToolTipText("");

        lbl_EstadoCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_EstadoCuenta.setText("afsdf");
        lbl_EstadoCuenta.setToolTipText("");

        lbl_Username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Username.setText("asff");
        lbl_Username.setToolTipText("");

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Nombre.setText("asdf");
        lbl_Nombre.setToolTipText("");

        lbl_Identificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_Identificacion.setText("asff");
        lbl_Identificacion.setToolTipText("");

        btn_CambiarEstado.setText("Deshabilitar");
        btn_CambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CambiarEstadoActionPerformed(evt);
            }
        });

        btn_Cerrar.setText("Cerrar");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_IngrUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl_EstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_CambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_IngrUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consultar))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CambiarEstado)
                        .addComponent(lbl_EstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tf_IngrUsernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tf_IngrUsernameCaretUpdate
        habInhabUsersControlador.recibirUsername(tf_IngrUsername.getText());
        limpiarCampos();
        btn_CambiarEstado.setEnabled(false);
    }//GEN-LAST:event_tf_IngrUsernameCaretUpdate

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        habInhabUsersControlador.cerrar();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        if(tf_IngrUsername.getText().length()<1){
            JOptionPane.showMessageDialog(null, "Ingrese el username de la cuenta");
            return;
        }
        Usuario usuario = habInhabUsersControlador.getUsuario();
        if(usuario == null){
            JOptionPane.showMessageDialog(null, "El username no corresponde a ninguna cuenta registrada");
            return;
        }
        cargarInformacion(usuario);
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_CambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CambiarEstadoActionPerformed
        if(btn_CambiarEstado.getText().equals("Hablilitar")){
            habInhabUsersControlador.habilitarUsuario();
            lbl_EstadoCuenta.setText("Habilitado");
            btn_CambiarEstado.setText("Inhabilitar");
        }else{
            habInhabUsersControlador.inhabilitarUsuario();
            lbl_EstadoCuenta.setText("Inhabilitado");
            btn_CambiarEstado.setText("Habilitar");
        }
    }//GEN-LAST:event_btn_CambiarEstadoActionPerformed
 
    public void limpiarCampos(){
        lbl_Nombre.setText("");
        lbl_Identificacion.setText("");
        lbl_Username.setText("");
        lbl_EstadoCuenta.setText("");
        btn_CambiarEstado.setEnabled(false);
    }
    public void cargarInformacion(Usuario usuario){
        lbl_Nombre.setText(usuario.getNombre());
        lbl_Identificacion.setText(usuario.getIdentificacion());
        lbl_Username.setText(usuario.getUsername());
        btn_CambiarEstado.setEnabled(true);
        if(usuario.isHabilitado()){
            lbl_EstadoCuenta.setText("Habilitado");
            btn_CambiarEstado.setText("Inhabilitar");
            return;
        }
        lbl_EstadoCuenta.setText("Inhabilitado");
        btn_CambiarEstado.setText("Habilitar");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CambiarEstado;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_EstadoCuenta;
    private javax.swing.JLabel lbl_Identificacion;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JTextField tf_IngrUsername;
    // End of variables declaration//GEN-END:variables
}
