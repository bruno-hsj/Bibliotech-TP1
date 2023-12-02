/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author user
 */
public class DetalhesContaUser extends javax.swing.JFrame {

    /**
     * Creates new form DetalhesContaUser
     */
    public DetalhesContaUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelStatusMulta = new javax.swing.JLabel();
        txtMostraStatus = new javax.swing.JTextField();
        LabelAtraso = new javax.swing.JLabel();
        txtMostraAtraso = new javax.swing.JTextField();
        btnPagarMulta = new javax.swing.JButton();
        labelSaldo = new javax.swing.JLabel();
        txtMostraSaldo = new javax.swing.JTextField();
        labelDeposito = new javax.swing.JLabel();
        txtValorDeposito = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        txtEditaUsuario = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        labelEditaTelefone = new javax.swing.JLabel();
        txtEditaTelefone = new javax.swing.JTextField();
        txtEditaEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditarLivro = new javax.swing.JButton();
        btnSalvarLivro = new javax.swing.JButton();
        btnPagarMulta1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BiblioTech | Detalhes da Conta");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imgs/usuario-icon.png")).getImage()
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("INFOS | USER");

        labelStatusMulta.setText("Status Multa");

        LabelAtraso.setText("Dias Atrasados");

        btnPagarMulta.setBackground(new java.awt.Color(78, 154, 25));
        btnPagarMulta.setText("Pagar");

        labelSaldo.setText("Saldo");

        labelDeposito.setText("Depositar");

        labelUsuario.setText("Usuario");

        txtEditaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditaUsuarioActionPerformed(evt);
            }
        });

        labelSenha.setText("Senha");

        labelEditaTelefone.setText("Telefone");

        txtEditaTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditaTelefoneActionPerformed(evt);
            }
        });

        txtEditaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditaEmailActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditarLivro.setText("Editar");
        btnEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroActionPerformed(evt);
            }
        });

        btnSalvarLivro.setText("Salvar");
        btnSalvarLivro.setToolTipText("");
        btnSalvarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarLivroActionPerformed(evt);
            }
        });

        btnPagarMulta1.setBackground(new java.awt.Color(78, 154, 25));
        btnPagarMulta1.setText("Depositar");

        btnSair.setBackground(new java.awt.Color(149, 11, 13));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEditaTelefone)
                            .addComponent(labelSenha)
                            .addComponent(labelUsuario)
                            .addComponent(labelEmail))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvarLivro)
                                .addGap(26, 26, 26)
                                .addComponent(btnCancelar)
                                .addGap(27, 27, 27)
                                .addComponent(btnEditarLivro))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEditaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                .addComponent(txtEditaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)
                                .addComponent(txtEditaTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelStatusMulta)
                                .addGap(57, 57, 57)
                                .addComponent(txtMostraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelAtraso)
                                .addGap(46, 46, 46)
                                .addComponent(txtMostraAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSaldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDeposito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPagarMulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPagarMulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatusMulta)
                    .addComponent(txtMostraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagarMulta)
                    .addComponent(labelUsuario)
                    .addComponent(txtEditaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAtraso)
                    .addComponent(txtMostraAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaldo)
                    .addComponent(txtMostraSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEditaTelefone)
                    .addComponent(txtEditaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeposito)
                    .addComponent(txtValorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(txtEditaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagarMulta1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarLivro)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditarLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditaUsuarioActionPerformed

    private void txtEditaTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditaTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditaTelefoneActionPerformed

    private void txtEditaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditaEmailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroActionPerformed

    }//GEN-LAST:event_btnEditarLivroActionPerformed

    private void btnSalvarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarLivroActionPerformed

    }//GEN-LAST:event_btnSalvarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhesContaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesContaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesContaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesContaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesContaUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAtraso;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarLivro;
    private javax.swing.JButton btnPagarMulta;
    private javax.swing.JButton btnPagarMulta1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarLivro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelDeposito;
    private javax.swing.JLabel labelEditaTelefone;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelStatusMulta;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtEditaEmail;
    private javax.swing.JTextField txtEditaTelefone;
    private javax.swing.JTextField txtEditaUsuario;
    private javax.swing.JTextField txtMostraAtraso;
    private javax.swing.JTextField txtMostraSaldo;
    private javax.swing.JTextField txtMostraStatus;
    private javax.swing.JTextField txtValorDeposito;
    // End of variables declaration//GEN-END:variables
}
