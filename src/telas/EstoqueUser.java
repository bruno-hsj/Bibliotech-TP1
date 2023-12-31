/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import projeto.BancoDeDados;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Livro;
import projeto.Obra;
import projeto.Quadrinho;
import projeto.Revista;
import static telas.EstoqueAdm.informacoes;
import static telas.MainMenu.listaObras;

/**
 *
 * @author user
 */
public class EstoqueUser extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueUser
     * Tabela de Obras, Livros, Quadrinhos e Revistas
     */
    
     public String buscaNome;
     public String buscaGenero;
     public String buscaAutor;
     public String buscaEditora;
     
     //ArrayList<Obra> listaObras = new ArrayList<Obra>();
     ArrayList<Livro> livros = new ArrayList<Livro>();
     ArrayList<Quadrinho> quadrinhos = new ArrayList<Quadrinho>();
     ArrayList<Revista> revistas = new ArrayList<Revista>();

    
    public EstoqueUser() {
        initComponents();
        
        //Campos de Pesquisa
        btnBuscarLivro.setEnabled(false);
        btnEmprestimo.setEnabled(false);
        btnPesquisarLivro.setEnabled(true);
        
        //Bot�es de A��o
        
        txtBuscarAutor.setEnabled(false);
        txtBuscarEditora.setEnabled(false);
        txtBuscarGeneroLivro.setEnabled(false);
        txtBuscarNomeLivro.setEnabled(false);

        
    }

    public void carregaTabelaUser() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"T�tulo", "Infos", "Tipo", "P�ginas", "FaixaEtaria", "Publicacao", "Autor", "Editora", "qtdEstoque"}, 0);
        
        for(int i = 0; i < listaObras.size(); i++){
            /*
            Object linha [] = new Object[] {listaObras.get(i).getTitulo(), listaObras.get(i).getInfosObras(), tipoObras.get(i), listaObras.get(i).getQntdPaginas(),
            listaObras.get(i).getFaixaEtaria(), listaObras.get(i).getDataPublicacao, listaObras.get(i).getAutor().getNome(), listaObras.get(i).getEditora().getNome(),
            listaObras.get(i).getqtdLivrosEstoque()};
            */
            
            Object linha[] = new Object[] {listaObras.get(i).tipo, listaObras.get(i).getTitulo(), listaObras.get(i).getInfosObras(), listaObras.get(i).getIdioma(), listaObras.get(i).getQntdPaginas(), 
            listaObras.get(i).getFaixaEtaria(), listaObras.get(i).getDataPublicacao(), listaObras.get(i).getAutor().getNome(), listaObras.get(i).getEditora().getNome()};
            
            
            modelo.addRow(linha);
        }
        
        tblEstoque.setModel(modelo);
        
        tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(15);
        tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(5);
        tblEstoque.getColumnModel().getColumn(5).setPreferredWidth(5);
        tblEstoque.getColumnModel().getColumn(6).setPreferredWidth(20);
        tblEstoque.getColumnModel().getColumn(7).setPreferredWidth(50);
        tblEstoque.getColumnModel().getColumn(8).setPreferredWidth(50);
        tblEstoque.getColumnModel().getColumn(9).setPreferredWidth(20);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnPesquisarLivro = new javax.swing.JButton();
        btnBuscarLivro = new javax.swing.JButton();
        labelBuscarNomeLivro = new javax.swing.JLabel();
        txtBuscarNomeLivro = new javax.swing.JTextField();
        labelBuscarGeneroLivro = new javax.swing.JLabel();
        txtBuscarGeneroLivro = new javax.swing.JTextField();
        labelBuscarAutor = new javax.swing.JLabel();
        txtBuscarAutor = new javax.swing.JTextField();
        labelBuscarEditora = new javax.swing.JLabel();
        txtBuscarEditora = new javax.swing.JTextField();
        btnEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BiblioTech | Pesquisa no Estoque");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imgs/estoque-icon.png")).getImage()
        );

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "G�nero", "Tipo", "P�ginas", "Faixa Et�ria", "Publica��o", "Autor", "Editora", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEstoque);

        titulo.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("ESTOQUE | USER");

        btnSair.setBackground(new java.awt.Color(149, 11, 13));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnPesquisarLivro.setText("Pesquisar");
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        btnBuscarLivro.setBackground(new java.awt.Color(51, 153, 0));
        btnBuscarLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarLivro.setText("BUSCAR");
        btnBuscarLivro.setToolTipText("");
        btnBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLivroActionPerformed(evt);
            }
        });

        labelBuscarNomeLivro.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarNomeLivro.setText("Nome do Livro");

        txtBuscarNomeLivro.setToolTipText("Forne�a seu usu�rio");
        txtBuscarNomeLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNomeLivroActionPerformed(evt);
            }
        });

        labelBuscarGeneroLivro.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarGeneroLivro.setText("G�nero do Livro");

        txtBuscarGeneroLivro.setToolTipText("Forne�a seu usu�rio");
        txtBuscarGeneroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarGeneroLivroActionPerformed(evt);
            }
        });

        labelBuscarAutor.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarAutor.setText("Nome do Autor");

        txtBuscarAutor.setToolTipText("Forne�a seu usu�rio");
        txtBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAutorActionPerformed(evt);
            }
        });

        labelBuscarEditora.setForeground(new java.awt.Color(255, 255, 255));
        labelBuscarEditora.setText("Nome da Editora");

        txtBuscarEditora.setToolTipText("Forne�a seu usu�rio");
        txtBuscarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarEditoraActionPerformed(evt);
            }
        });

        btnEmprestimo.setBackground(new java.awt.Color(51, 112, 111));
        btnEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEmprestimo.setText("FAZER EMPR�STIMO");
        btnEmprestimo.setToolTipText("");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscarNomeLivro)
                            .addComponent(txtBuscarNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBuscarGeneroLivro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscarAutor)
                            .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBuscarEditora)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(397, 397, 397))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelBuscarNomeLivro)
                                            .addComponent(labelBuscarGeneroLivro))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelBuscarAutor)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBuscarNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelBuscarEditora)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarLivro))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmprestimo)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtBuscarNomeLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNomeLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNomeLivroActionPerformed

    private void txtBuscarGeneroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarGeneroLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarGeneroLivroActionPerformed

    private void txtBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAutorActionPerformed

    private void txtBuscarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEditoraActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
       new EmprestimoLivro().setVisible(true);        
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLivroActionPerformed
    //Bot�o de Busca.
    
                //C�digo para exibir resultado da busca por nome.
            if(txtBuscarNomeLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um t�tulo v�lido!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            Obra o;
            String titulo = "", information = "", lingua = "", datapubli = "";
            int pags = 0, faixaetaria = 0;
            String tituloBuscado = txtBuscarNomeLivro.getText();
            
            for(int j = 0; j < listaObras.size(); j++) {
                o = listaObras.get(j);
                
                if(tituloBuscado.equals(o.getTitulo())) {
                    titulo = String.valueOf(o.getTitulo());
                    information = informacoes.get(j);
                    lingua = String.valueOf(o.getIdioma());
                    pags = o.getQntdPaginas();
                    faixaetaria = o.getFaixaEtaria();
                    datapubli = String.valueOf(o.getDataPublicacao());
                    
                }
            }
            
            if(tituloBuscado.equals("")) {
                JOptionPane.showMessageDialog(null, "Nenhuma obra com esse t�tulo foi encontrada!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                
                txtTitulo.setText("");
                txtInfos.setText("");
                txtIdioma.setText("");
                txtQtdPaginas.setText("");
                txtFaixaEtaria.setText("");
                txtDataPublicacao.setText("");
                spnIncrementaEstoque.setValue(0);
            } else {    
                txtTitulo.setText(titulo);
                txtInfos.setText(information);
                txtIdioma.setText(lingua);
                txtQtdPaginas.setText(Integer.toString(pags));
                txtFaixaEtaria.setText(Integer.toString(faixaetaria));
                txtDataPublicacao.setText(datapubli);
                
            }
            
            txtTitulo.selectAll();
            txtTitulo.requestFocus();
        }
                
           
           
           if(BancoDeDados.in(buscaGenero, "Bibliotecario", "Obras") ){
                //C�digo para exibir resultado da busca por genero.
                
            }
           
           if(BancoDeDados.in(buscaEditora, "Bibliotecario", "Obras") ){
                //C�digo para exibir resultado da busca por editora.
                
            }
           
           if(BancoDeDados.in(buscaAutor, "Bibliotecario", "Obras") ){
                //C�digo para exibir resultado da busca por autor.
                
            }
           
    

    }//GEN-LAST:event_btnBuscarLivroActionPerformed

    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
        //Campos de Pesquisa
        btnBuscarLivro.setEnabled(true);
        btnEmprestimo.setEnabled(true);
        btnPesquisarLivro.setEnabled(true);
        
        //Bot�es de A��o
        
        txtBuscarAutor.setEnabled(true);
        txtBuscarEditora.setEnabled(true);
        txtBuscarGeneroLivro.setEnabled(true);
        txtBuscarNomeLivro.setEnabled(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(EstoqueUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLivro;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscarAutor;
    private javax.swing.JLabel labelBuscarEditora;
    private javax.swing.JLabel labelBuscarGeneroLivro;
    private javax.swing.JLabel labelBuscarNomeLivro;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBuscarAutor;
    private javax.swing.JTextField txtBuscarEditora;
    private javax.swing.JTextField txtBuscarGeneroLivro;
    private javax.swing.JTextField txtBuscarNomeLivro;
    // End of variables declaration//GEN-END:variables

    private int size(List<String> lerArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
