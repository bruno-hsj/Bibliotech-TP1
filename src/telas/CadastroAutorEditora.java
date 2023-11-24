package telas;

import projeto.Autor;
import projeto.Editora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroAutorEditora extends javax.swing.JFrame {

    static ArrayList<Autor> listaAutores;
    static ArrayList<Editora> listaEditoras;
    
    String botao;
    String botaoE;
    
    public CadastroAutorEditora() {
        initComponents();
        
        listaAutores = new ArrayList();
        listaEditoras = new ArrayList();
        
        // Cadastro Autor
        btnCadastrarAutor.setEnabled(true);
        btnSalvarAutor.setEnabled(false);
        btnEditarAutor.setEnabled(false);
        btnCancelarAutor.setEnabled(false);
        btnExcluirAutor.setEnabled(false);
        
        txtNomeAutor.setEnabled(false);
        txtNacionalidadeAutor.setEnabled(false);
        txtDataNascAutor.setEnabled(false);
        
        
        // Cadastro Editora
        btnCadastrarEditora.setEnabled(true);
        btnSalvarEditora.setEnabled(false);
        btnEditarEditora.setEnabled(false);
        btnCancelarEditora.setEnabled(false);
        btnExcluirEditora.setEnabled(false);
        
        txtNomeEditora.setEnabled(false);
        txtOrigemEditora.setEnabled(false);
        txtFundacaoEditora.setEnabled(false);
        
    }
    
    public void carregaTabelaAutores() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"nome", "nacionalidade", "dataNascimento"}, 0);
        
        for(int i = 0; i < listaAutores.size();i++) {
            Object linha[] = new Object[] {listaAutores.get(i).getNome(), listaAutores.get(i).getNacionalidade(), listaAutores.get(i).getDataNascimento()};
            modelo.addRow(linha);
        }
        
        tblAutor.setModel(modelo);
        
        tblAutor.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblAutor.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblAutor.getColumnModel().getColumn(2).setPreferredWidth(20);
        
    }
    
    public void carregaTabelaEditoras() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"nome", "paisOrigem", "anoFundacao"}, 0);
        
        for(int i = 0; i < listaEditoras.size();i++) {
            Object linha[] = new Object[] {listaEditoras.get(i).getNome(), listaEditoras.get(i).getPaisOrigem(), listaEditoras.get(i).getAnoFundacao()};
            modelo.addRow(linha);
        }
        
        tblEditora.setModel(modelo);
        
        tblEditora.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblEditora.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblEditora.getColumnModel().getColumn(2).setPreferredWidth(10);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        txtNomeAutor = new javax.swing.JTextField();
        btnCadastrarAutor = new javax.swing.JButton();
        lblNacionalidadeAutor = new javax.swing.JLabel();
        txtNacionalidadeAutor = new javax.swing.JTextField();
        lblDataNascAutor = new javax.swing.JLabel();
        txtDataNascAutor = new javax.swing.JTextField();
        btnSalvarAutor = new javax.swing.JButton();
        btnCancelarAutor = new javax.swing.JButton();
        btnEditarAutor = new javax.swing.JButton();
        btnExcluirAutor = new javax.swing.JButton();
        btnCadastrarEditora = new javax.swing.JButton();
        lblNomeEditora = new javax.swing.JLabel();
        txtNomeEditora = new javax.swing.JTextField();
        lblOrigemEditora = new javax.swing.JLabel();
        txtOrigemEditora = new javax.swing.JTextField();
        lblFundacaoEditora = new javax.swing.JLabel();
        txtFundacaoEditora = new javax.swing.JTextField();
        btnSalvarEditora = new javax.swing.JButton();
        btnCancelarEditora = new javax.swing.JButton();
        btnEditarEditora = new javax.swing.JButton();
        btnExcluirEditora = new javax.swing.JButton();
        tblInfosAutor = new javax.swing.JScrollPane();
        tblAutor = new javax.swing.JTable();
        tblInfosEditora = new javax.swing.JScrollPane();
        tblEditora = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BiblioTech | Cadastro Autor & Editora");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imgs/cadastroAutorEditora-icon.png")).getImage()
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1116, 506));

        titulo.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CADASTRO AUTOR / EDITORA");

        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Nome");

        txtNomeAutor.setToolTipText("Forneça seu usuário");
        txtNomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAutorActionPerformed(evt);
            }
        });

        btnCadastrarAutor.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarAutor.setText("Cadastrar Autor");
        btnCadastrarAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAutorActionPerformed(evt);
            }
        });

        lblNacionalidadeAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidadeAutor.setText("Nacionalidade");

        txtNacionalidadeAutor.setToolTipText("Forneça seu usuário");
        txtNacionalidadeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadeAutorActionPerformed(evt);
            }
        });

        lblDataNascAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascAutor.setText("Data de Nascimento");

        txtDataNascAutor.setToolTipText("Forneça seu usuário");
        txtDataNascAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascAutorActionPerformed(evt);
            }
        });

        btnSalvarAutor.setText("Salvar");
        btnSalvarAutor.setToolTipText("");
        btnSalvarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAutorActionPerformed(evt);
            }
        });

        btnCancelarAutor.setText("Cancelar");
        btnCancelarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAutorActionPerformed(evt);
            }
        });

        btnEditarAutor.setText("Editar");
        btnEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAutorActionPerformed(evt);
            }
        });

        btnExcluirAutor.setText("Excluir");
        btnExcluirAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAutorActionPerformed(evt);
            }
        });

        btnCadastrarEditora.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarEditora.setText("Cadastrar Editora");
        btnCadastrarEditora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEditoraActionPerformed(evt);
            }
        });

        lblNomeEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEditora.setText("Nome");

        txtNomeEditora.setToolTipText("Forneça seu usuário");
        txtNomeEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEditoraActionPerformed(evt);
            }
        });

        lblOrigemEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblOrigemEditora.setText("País de Origem");

        txtOrigemEditora.setToolTipText("Forneça seu usuário");
        txtOrigemEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigemEditoraActionPerformed(evt);
            }
        });

        lblFundacaoEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblFundacaoEditora.setText("Ano de Fundação");

        txtFundacaoEditora.setToolTipText("Forneça seu usuário");
        txtFundacaoEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundacaoEditoraActionPerformed(evt);
            }
        });

        btnSalvarEditora.setText("Salvar");
        btnSalvarEditora.setToolTipText("");
        btnSalvarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditoraActionPerformed(evt);
            }
        });

        btnCancelarEditora.setText("Cancelar");
        btnCancelarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditoraActionPerformed(evt);
            }
        });

        btnEditarEditora.setText("Editar");
        btnEditarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEditoraActionPerformed(evt);
            }
        });

        btnExcluirEditora.setText("Excluir");
        btnExcluirEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEditoraActionPerformed(evt);
            }
        });

        tblInfosAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfosAutorMouseClicked(evt);
            }
        });

        tblAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Nacionalidade", "Data Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInfosAutor.setViewportView(tblAutor);

        tblInfosEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfosEditoraMouseClicked(evt);
            }
        });

        tblEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Origem", "Fundação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInfosEditora.setViewportView(tblEditora);

        btnSair.setBackground(new java.awt.Color(149, 11, 13));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOrigemEditora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeEditora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarEditora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFundacaoEditora)
                                .addComponent(lblNomeEditora)
                                .addComponent(lblOrigemEditora)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnSalvarEditora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCancelarEditora)
                                    .addGap(24, 24, 24)
                                    .addComponent(btnEditarEditora)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluirEditora))
                                .addComponent(lblDataNascAutor)
                                .addComponent(labelTitulo)
                                .addComponent(lblNacionalidadeAutor)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCadastrarAutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomeAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalvarAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelarAutor)
                                        .addGap(24, 24, 24)
                                        .addComponent(btnEditarAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExcluirAutor))
                                    .addComponent(txtNacionalidadeAutor, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(txtFundacaoEditora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataNascAutor))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(637, 637, 637)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tblInfosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tblInfosEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNacionalidadeAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacionalidadeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDataNascAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataNascAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarAutor)
                            .addComponent(btnCancelarAutor)
                            .addComponent(btnEditarAutor)
                            .addComponent(btnExcluirAutor)))
                    .addComponent(tblInfosAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrarEditora)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomeEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblOrigemEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigemEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFundacaoEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFundacaoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarEditora)
                            .addComponent(btnCancelarEditora)
                            .addComponent(btnEditarEditora)
                            .addComponent(btnExcluirEditora)))
                    .addComponent(tblInfosEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnSair)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEditoraActionPerformed
        botaoE = "editar";
        
        btnCadastrarEditora.setEnabled(false);
        btnSalvarEditora.setEnabled(true);
        btnEditarEditora.setEnabled(false);
        btnCancelarEditora.setEnabled(true);
        btnExcluirEditora.setEnabled(false);

        txtNomeEditora.setEnabled(true);
        txtOrigemEditora.setEnabled(true);
        txtFundacaoEditora.setEnabled(true);
    }//GEN-LAST:event_btnEditarEditoraActionPerformed

    private void btnCancelarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditoraActionPerformed
        btnCadastrarEditora.setEnabled(true);
        btnSalvarEditora.setEnabled(false);
        btnEditarEditora.setEnabled(false);
        btnCancelarEditora.setEnabled(false);
        btnExcluirEditora.setEnabled(false);

        txtNomeEditora.setEnabled(false);
        txtOrigemEditora.setEnabled(false);
        txtFundacaoEditora.setEnabled(false);
        
        txtNomeEditora.setText("");
        txtOrigemEditora.setText("");
        txtFundacaoEditora.setText("");
    }//GEN-LAST:event_btnCancelarEditoraActionPerformed

    private void btnSalvarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditoraActionPerformed
        if(txtNomeEditora.getText().equals("") ||  txtOrigemEditora.getText().equals("") || txtFundacaoEditora.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Mensagem", JOptionPane.PLAIN_MESSAGE); 
        } else {
            String nomeEditora = txtNomeEditora.getText();
            String origemEditora = txtOrigemEditora.getText();
            String fundacaoEditora = txtFundacaoEditora.getText();
            
            if(botaoE.equals("novo")) {
                Editora editora = new Editora(nomeEditora, origemEditora, fundacaoEditora);
                
                listaEditoras.add(editora);
                
                JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else if(botaoE.equals("editar")) {
                int indexE = tblEditora.getSelectedRow();
                
                listaEditoras.get(indexE).setNome(nomeEditora);
                listaEditoras.get(indexE).setPaisOrigem(origemEditora);
                listaEditoras.get(indexE).setAnoFundacao(fundacaoEditora);
                
                JOptionPane.showMessageDialog(null, "Dados da editora editados com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            carregaTabelaEditoras();
            
            txtNomeEditora.setText("");
            txtOrigemEditora.setText("");
            txtFundacaoEditora.setText("");
            
            btnCadastrarEditora.setEnabled(true);
            btnSalvarEditora.setEnabled(false);
            btnEditarEditora.setEnabled(false);
            btnCancelarEditora.setEnabled(false);
            btnExcluirEditora.setEnabled(false);

            txtNomeEditora.setEnabled(false);
            txtOrigemEditora.setEnabled(false);
            txtFundacaoEditora.setEnabled(false);
            

        } 
    }//GEN-LAST:event_btnSalvarEditoraActionPerformed

    private void btnEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAutorActionPerformed
        botao = "editar";
        
        btnCadastrarAutor.setEnabled(false);
        btnSalvarAutor.setEnabled(true);
        btnEditarAutor.setEnabled(false);
        btnCancelarAutor.setEnabled(true);
        btnExcluirAutor.setEnabled(false);
        
        txtNomeAutor.setEnabled(true);
        txtNacionalidadeAutor.setEnabled(true);
        txtDataNascAutor.setEnabled(true);
    }//GEN-LAST:event_btnEditarAutorActionPerformed

    private void btnCancelarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAutorActionPerformed
        btnCadastrarAutor.setEnabled(true);
        btnSalvarAutor.setEnabled(false);
        btnEditarAutor.setEnabled(false);
        btnCancelarAutor.setEnabled(false);
        btnExcluirAutor.setEnabled(false);
        
        txtNomeAutor.setEnabled(false);
        txtNacionalidadeAutor.setEnabled(false);
        txtDataNascAutor.setEnabled(false);
        
        txtNomeAutor.setText("");
        txtNacionalidadeAutor.setText("");
        txtDataNascAutor.setText("");
    }//GEN-LAST:event_btnCancelarAutorActionPerformed

    private void btnSalvarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAutorActionPerformed
        if(txtNomeAutor.getText().equals("") ||  txtNacionalidadeAutor.getText().equals("") || txtDataNascAutor.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Mensagem", JOptionPane.PLAIN_MESSAGE); 
        } else {
            String nomeAutor = txtNomeAutor.getText();
            String nacionalidadeAutor = txtNacionalidadeAutor.getText();
            String dataNascimentoAutor = txtDataNascAutor.getText();
            
            if(botao.equals("novo")) {
                Autor autor = new Autor(nomeAutor, nacionalidadeAutor, dataNascimentoAutor);
                
                listaAutores.add(autor);
                
                JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            } else if(botao.equals("editar")) {
                int index = tblAutor.getSelectedRow();
                
                listaAutores.get(index).setNome(nomeAutor);
                listaAutores.get(index).setNacionalidade(nacionalidadeAutor);
                listaAutores.get(index).setDataNascimento(dataNascimentoAutor);
                
                JOptionPane.showMessageDialog(null, "Dados do autor editados com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            carregaTabelaAutores();
            
            txtNomeAutor.setText("");
            txtNacionalidadeAutor.setText("");
            txtDataNascAutor.setText("");
            
            btnCadastrarAutor.setEnabled(true);
            btnSalvarAutor.setEnabled(false);
            btnEditarAutor.setEnabled(false);
            btnCancelarAutor.setEnabled(false);
            btnExcluirAutor.setEnabled(false);
            
            txtNomeAutor.setEnabled(false);
            txtNacionalidadeAutor.setEnabled(false);
            txtDataNascAutor.setEnabled(false);
        } 
    }//GEN-LAST:event_btnSalvarAutorActionPerformed

    private void txtNomeEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEditoraActionPerformed

    private void txtOrigemEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigemEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigemEditoraActionPerformed

    private void txtFundacaoEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundacaoEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundacaoEditoraActionPerformed

    private void txtDataNascAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascAutorActionPerformed

    private void txtNacionalidadeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadeAutorActionPerformed

    private void txtNomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAutorActionPerformed

    }//GEN-LAST:event_txtNomeAutorActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAutorActionPerformed
        int index = tblAutor.getSelectedRow();
        
        if(index >= 0 && index < listaAutores.size()) {
            listaAutores.remove(index);          
        }
        
        carregaTabelaAutores();
        
        txtNomeAutor.setText("");
        txtNacionalidadeAutor.setText("");
        txtDataNascAutor.setText("");

        btnCadastrarAutor.setEnabled(true);
        btnSalvarAutor.setEnabled(false);
        btnEditarAutor.setEnabled(false);
        btnCancelarAutor.setEnabled(false);
        btnExcluirAutor.setEnabled(false);

        txtNomeAutor.setEnabled(false);
        txtNacionalidadeAutor.setEnabled(false);
        txtDataNascAutor.setEnabled(false);
    }//GEN-LAST:event_btnExcluirAutorActionPerformed

    private void btnExcluirEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEditoraActionPerformed
       int indexEE = tblEditora.getSelectedRow();
        
        if(indexEE >= 0 && indexEE < listaEditoras.size()) {
            listaEditoras.remove(indexEE);          
        }
        
        carregaTabelaEditoras();
        
        txtNomeEditora.setText("");
        txtOrigemEditora.setText("");
        txtFundacaoEditora.setText("");

        btnCadastrarEditora.setEnabled(true);
        btnSalvarEditora.setEnabled(false);
        btnEditarEditora.setEnabled(false);
        btnCancelarEditora.setEnabled(false);
        btnExcluirEditora.setEnabled(false);

        txtNomeEditora.setEnabled(false);
        txtOrigemEditora.setEnabled(false);
        txtFundacaoEditora.setEnabled(false);
    }//GEN-LAST:event_btnExcluirEditoraActionPerformed

    private void btnCadastrarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAutorActionPerformed
        botao = "novo";
        
        btnCadastrarAutor.setEnabled(false);
        btnSalvarAutor.setEnabled(true);
        btnEditarAutor.setEnabled(false);
        btnCancelarAutor.setEnabled(true);
        btnExcluirAutor.setEnabled(false);
        
        txtNomeAutor.setEnabled(true);
        txtNacionalidadeAutor.setEnabled(true);
        txtDataNascAutor.setEnabled(true);
        
        
        txtNomeAutor.requestFocus();  
    }//GEN-LAST:event_btnCadastrarAutorActionPerformed

    private void tblInfosAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfosAutorMouseClicked
        int i = tblAutor.getSelectedRow();
        
        if(i >= 0 && i < listaAutores.size()) {
            Autor aut = listaAutores.get(i);
            txtNomeAutor.setText(aut.getNome());
            txtNacionalidadeAutor.setText(aut.getNacionalidade());
            txtDataNascAutor.setText(aut.getDataNascimento());
        }
        
        btnCadastrarAutor.setEnabled(false);
        btnSalvarAutor.setEnabled(true);
        btnEditarAutor.setEnabled(true);
        btnCancelarAutor.setEnabled(true);
        btnExcluirAutor.setEnabled(true);
    }//GEN-LAST:event_tblInfosAutorMouseClicked

    private void btnCadastrarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEditoraActionPerformed
        botaoE = "novo";
        
        btnCadastrarEditora.setEnabled(false);
        btnSalvarEditora.setEnabled(true);
        btnEditarEditora.setEnabled(false);
        btnCancelarEditora.setEnabled(true);
        btnExcluirEditora.setEnabled(false);
        
        txtNomeEditora.setEnabled(true);
        txtOrigemEditora.setEnabled(true);
        txtFundacaoEditora.setEnabled(true);
        
        
        txtNomeEditora.requestFocus();
    }//GEN-LAST:event_btnCadastrarEditoraActionPerformed

    private void tblInfosEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfosEditoraMouseClicked
        int i = tblEditora.getSelectedRow();
        
        if(i >= 0 && i < listaEditoras.size()) {
            Editora edit = listaEditoras.get(i);
            txtNomeEditora.setText(edit.getNome());
            txtOrigemEditora.setText(edit.getPaisOrigem());
            txtFundacaoEditora.setText(edit.getAnoFundacao());
        }

        btnCadastrarEditora.setEnabled(false);
        btnSalvarEditora.setEnabled(true);
        btnEditarEditora.setEnabled(true);
        btnCancelarEditora.setEnabled(true);
        btnExcluirEditora.setEnabled(true);  
    }//GEN-LAST:event_tblInfosEditoraMouseClicked


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
            java.util.logging.Logger.getLogger(CadastroAutorEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutorEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutorEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutorEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAutorEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAutor;
    private javax.swing.JButton btnCadastrarEditora;
    private javax.swing.JButton btnCancelarAutor;
    private javax.swing.JButton btnCancelarEditora;
    private javax.swing.JButton btnEditarAutor;
    private javax.swing.JButton btnEditarEditora;
    private javax.swing.JButton btnExcluirAutor;
    private javax.swing.JButton btnExcluirEditora;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarAutor;
    private javax.swing.JButton btnSalvarEditora;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblDataNascAutor;
    private javax.swing.JLabel lblFundacaoEditora;
    private javax.swing.JLabel lblNacionalidadeAutor;
    private javax.swing.JLabel lblNomeEditora;
    private javax.swing.JLabel lblOrigemEditora;
    private javax.swing.JTable tblAutor;
    private javax.swing.JTable tblEditora;
    private javax.swing.JScrollPane tblInfosAutor;
    private javax.swing.JScrollPane tblInfosEditora;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtDataNascAutor;
    private javax.swing.JTextField txtFundacaoEditora;
    private javax.swing.JTextField txtNacionalidadeAutor;
    private javax.swing.JTextField txtNomeAutor;
    private javax.swing.JTextField txtNomeEditora;
    private javax.swing.JTextField txtOrigemEditora;
    // End of variables declaration//GEN-END:variables
}
