package telas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import projeto.Autor;
import projeto.BancoDeDados;
import projeto.Bibliotecario;
import projeto.Cliente;
import projeto.Editora;
import projeto.Emprestimo;
import projeto.Obra;

public class MainMenu extends javax.swing.JFrame {

    public static String usuario;
    public String linha;
    public static ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    public static ArrayList<Obra> listaObras = new ArrayList<>();
    public static ArrayList<Editora> listaEditoras = new ArrayList<>();
    public static ArrayList<Autor> listaAutores = new ArrayList<>();
            
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgLivros = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbCheckAdm = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BiblioTech | Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu-icon-book.png")).getImage()
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        imgLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/capa-menu-livros.jpg"))); // NOI18N

        titulo.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("BIBLIOTECH");

        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");

        txtLogin.setToolTipText("Forneca seu nome de usuario");
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha");

        txtSenha.setToolTipText("Forneca sua senha");

        btnEntrar.setBackground(new java.awt.Color(51, 164, 40));
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Novo por aqui? Cadastre-se agora");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        cbCheckAdm.setForeground(new java.awt.Color(255, 255, 255));
        cbCheckAdm.setText("Sou Bibliotecário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelLogin)
                                .addComponent(labelSenha)
                                .addComponent(txtSenha)
                                .addComponent(txtLogin)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(cbCheckAdm))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(imgLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(57, 57, 57)
                .addComponent(labelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(cbCheckAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed

    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (cbCheckAdm.isSelected()) {
            //Verificação no IF se usuário faz parte de usuário administrador
            if (Bibliotecario.comparaDados(txtLogin.getText(), txtSenha.getText()))
                new AdmLogado().setVisible(true);
            else{
                JOptionPane.showMessageDialog(null, "Senha ou usuário inválido(s)!", "Usuário ou Senha inválidos!", JOptionPane.PLAIN_MESSAGE); 
                txtLogin.requestFocus();
            }
        }
        else{
           //Busca em BancoDeDados se existe User e Senha compatíveis. 
           linha = txtLogin.getText() + " " + txtSenha.getText();
           if(BancoDeDados.in(linha, "Cliente", "Login") ){
                new UserLogado().setVisible(true);
                
            } else {
            //Caso não encontre usuário válido, exibir mensagem de erro.
                JOptionPane.showMessageDialog(null, "Considere realizar o cadastro de usuário!", "Usuário ou Senha inválidos!", JOptionPane.PLAIN_MESSAGE); 
                txtLogin.requestFocus();

            }    
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       new CadastroUser().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        BancoDeDados.criarDiretorio("Cliente");
        BancoDeDados.criarArquivo("Login");
        BancoDeDados.criarArquivo("Cadastro");
        BancoDeDados.criarArquivo("User");
        BancoDeDados.criarArquivo("Emprestimo");
        
        BancoDeDados.criarDiretorio("Bibliotecario");
        BancoDeDados.criarArquivo("Obras");
        BancoDeDados.criarArquivo("NomeObras");
        BancoDeDados.criarArquivo("Autor");
        BancoDeDados.criarArquivo("NomeAutor");
        BancoDeDados.criarArquivo("Editora");
        BancoDeDados.criarArquivo("NomeEditora");
        
        
        ArrayList<String> lista = (ArrayList<String>) BancoDeDados.lerArquivo("Cliente", "Emprestimo");
        for (String i : lista){
            String[] aux = i.split(" ");
            //listaEmprestimos.add(new Emprestimo(aux[0], aux[1]));
        }
                
        ArrayList<String> list = (ArrayList<String>) BancoDeDados.lerArquivo("Cliente", "Cadastro");
        for (String sub : list){
            String[] aux = sub.split(" ");
            listaClientes.add(new Cliente(aux[0], aux[1], aux[2], aux[3]));
        }
        
        ArrayList<String> listaEd = (ArrayList<String>) BancoDeDados.lerArquivo("Bibliotecario", "Editora");
        for (String sub : listaEd){
            String[] aux  = sub.split("\\|");
            listaEditoras.add(new Editora(aux[0], aux[1], aux[2]));
        }
        
        ArrayList<String> listaA = (ArrayList<String>) BancoDeDados.lerArquivo("Bibliotecario", "Autor");
        for (String sub : listaA){
            String[] aux  = sub.split("\\|");
            listaAutores.add(new Autor(aux[0], aux[1], aux[2]));
        }
        
        ArrayList<String> listaO = (ArrayList<String>) BancoDeDados.lerArquivo("Bibliotecario", "Obras");
        for (String sub : listaO){
            String[] aux  = sub.split("\\|");
            String nomeAutor = aux[6];
            String nomeEditora = aux[7];
            Autor autor = null;
            Editora editora = null;
            
            for (Autor aut: listaAutores){
                if (aut.getNome().equals(nomeAutor)){
                    autor = aut;
                    break;
                }   
            }  
            for (Editora edit: listaEditoras){
                if (edit.getNome().equals(nomeEditora)){
                    editora = edit;
                    break;
                 }   
            }
            listaObras.add(new Obra(aux[0], aux[1], aux[2], Integer.parseInt(aux[3]), Integer.parseInt(aux[4]), aux[5], autor, editora, aux[8]));
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JRadioButton cbCheckAdm;
    private javax.swing.JLabel imgLivros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
