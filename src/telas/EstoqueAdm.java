package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.Autor;
import projeto.BancoDeDados;
import projeto.Editora;
import projeto.Livro;
import projeto.Obra;
import projeto.Quadrinho;
import projeto.Revista;
import static telas.MainMenu.listaAutores;
import static telas.MainMenu.listaEditoras;
import static telas.MainMenu.listaObras;


public class EstoqueAdm extends javax.swing.JFrame {
    
    private String linhaAntiga;
    private String nomeAntigo;
    static ArrayList<String> tiposObras;
    static ArrayList<String> autoresSelecionados;
    static ArrayList<String> editorasSelecionadas;
    static ArrayList<String> informacoes;
    //static ArrayList<Integer> estoque;
    
    String botao;
    
    // Carregando as infos dos Autores já cadastrados previamente
    public void carregaAutoresComboBox() {
        for(int i = 0; i < listaAutores.size(); i++) {
            dropAutor.addItem(listaAutores.get(i).getNome());
        }
    }
    
    // Carregando as informações das Editoras já cadastradas previamente
    public void carregaEditorasComboBox() {
        for(int i = 0; i < listaEditoras.size(); i++) {
            dropEditora.addItem(listaEditoras.get(i).getNome());
        }
    }
    
    public EstoqueAdm() {
        initComponents();
        
        // ArrayLists
        autoresSelecionados = new ArrayList();
        editorasSelecionadas = new ArrayList();
        tiposObras = new ArrayList();
        //estoque = new ArrayList();
        informacoes = new ArrayList();
        
        // Botoes
        btnNovoLivro.setEnabled(true);
        btnSalvarLivro.setEnabled(false);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluirLivro.setEnabled(false);
        //spnIncrementaEstoque.setEnabled(false);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(false);
        dropEditora.setEnabled(false);

        
        // Checkbox
        checkLivro.setEnabled(false);
        checkRevista.setEnabled(false);
        checkQuadrinho.setEnabled(false);
        
        // Textos
        txtTitulo.setEnabled(false);
        txtInfos.setEnabled(false);
        txtIdioma.setEnabled(false);
        txtQtdPaginas.setEnabled(false);
        txtFaixaEtaria.setEnabled(false);
        txtDataPublicacao.setEnabled(false);
        
        carregaAutoresComboBox();
        carregaEditorasComboBox();
        carregaTabelaObras();
    }

    public void carregaTabelaObras() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Tipo", "Titulo", "Infos", "Idioma", "Paginas", "FaixaEtaria", "Publicacao", "Autor", "Editora"}, 0);
        
        for(int i = 0; i < listaObras.size();i++) {        
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
        //tblEstoque.getColumnModel().getColumn(9).setPreferredWidth(20);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        tblInfosEstoque = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        txtInfos = new javax.swing.JTextField();
        labelIdioma = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        labelQtdPaginas = new javax.swing.JLabel();
        txtQtdPaginas = new javax.swing.JTextField();
        labelIdade = new javax.swing.JLabel();
        labelDataPublicacao = new javax.swing.JLabel();
        btnNovoLivro = new javax.swing.JButton();
        btnSalvarLivro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditarLivro = new javax.swing.JButton();
        btnExcluirLivro = new javax.swing.JButton();
        txtCampoPesquisa = new javax.swing.JTextField();
        btnBuscarLivro = new javax.swing.JButton();
        btnPesquisarLivro = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtFaixaEtaria = new javax.swing.JTextField();
        dropAutor = new javax.swing.JComboBox<>();
        dropEditora = new javax.swing.JComboBox<>();
        labelAddAutor = new javax.swing.JLabel();
        labelAddEditora = new javax.swing.JLabel();
        labelTipoObra = new javax.swing.JLabel();
        labelAddEditora1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDataPublicacao = new javax.swing.JFormattedTextField();
        checkLivro = new javax.swing.JRadioButton();
        checkRevista = new javax.swing.JRadioButton();
        checkQuadrinho = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BiblioTech | Gerenciamento de Estoque");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imgs/estoque-icon.png")).getImage()
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Centaur", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("ESTOQUE | ADMIN");

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo Obra", "Titulo", "Infos", "Idioma", "Páginas", "Faixa Etária", "Publicação", "Autor", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        tblInfosEstoque.setViewportView(tblEstoque);

        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Titulo");

        txtTitulo.setToolTipText("Forneça o titulo do livro");
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        labelGenero.setForeground(new java.awt.Color(255, 255, 255));
        labelGenero.setText("Infos. Revista / Quadrinho / Livro");

        txtInfos.setToolTipText("Forneça as informaçoes adicionais da obra");
        txtInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInfosActionPerformed(evt);
            }
        });

        labelIdioma.setForeground(new java.awt.Color(255, 255, 255));
        labelIdioma.setText("Idioma");

        txtIdioma.setToolTipText("Forneça o idioma");
        txtIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdiomaActionPerformed(evt);
            }
        });

        labelQtdPaginas.setForeground(new java.awt.Color(255, 255, 255));
        labelQtdPaginas.setText("Quantidade de Páginas");

        txtQtdPaginas.setToolTipText("Forneça a quantidade de paginas");
        txtQtdPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdPaginasActionPerformed(evt);
            }
        });

        labelIdade.setForeground(new java.awt.Color(255, 255, 255));
        labelIdade.setText("Faixa Etária");

        labelDataPublicacao.setForeground(new java.awt.Color(255, 255, 255));
        labelDataPublicacao.setText("Data de Publicação");

        btnNovoLivro.setText("Novo");
        btnNovoLivro.setToolTipText("");
        btnNovoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLivroActionPerformed(evt);
            }
        });

        btnSalvarLivro.setText("Salvar");
        btnSalvarLivro.setToolTipText("");
        btnSalvarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarLivroActionPerformed(evt);
            }
        });

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

        btnExcluirLivro.setText("Excluir");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });

        txtCampoPesquisa.setToolTipText("Insira o nome da obra que esta procurando");

        btnBuscarLivro.setBackground(new java.awt.Color(51, 153, 0));
        btnBuscarLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarLivro.setText("BUSCAR");
        btnBuscarLivro.setToolTipText("");
        btnBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLivroActionPerformed(evt);
            }
        });

        btnPesquisarLivro.setBackground(new java.awt.Color(78, 98, 126));
        btnPesquisarLivro.setText("Pesquisar");
        btnPesquisarLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarLivroMouseClicked(evt);
            }
        });
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(149, 11, 13));
        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtFaixaEtaria.setToolTipText("Forneça a faixa etaria");
        txtFaixaEtaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaixaEtariaActionPerformed(evt);
            }
        });

        labelAddAutor.setForeground(new java.awt.Color(255, 255, 255));
        labelAddAutor.setText("Adicionar Autor");

        labelAddEditora.setForeground(new java.awt.Color(255, 255, 255));
        labelAddEditora.setText("Adicionar Editora");

        labelTipoObra.setForeground(new java.awt.Color(255, 255, 255));
        labelTipoObra.setText("Tipo de Obra");

        labelAddEditora1.setForeground(new java.awt.Color(255, 255, 255));
        labelAddEditora1.setText("Realizar pesquisa pelo título da obra");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NÃO UTILIZE ACENTOS!!!");

        try {
            txtDataPublicacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPublicacao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        bgGrupo.add(checkLivro);
        checkLivro.setForeground(new java.awt.Color(255, 255, 255));
        checkLivro.setText("Livro");

        bgGrupo.add(checkRevista);
        checkRevista.setForeground(new java.awt.Color(255, 255, 255));
        checkRevista.setText("Revista");

        bgGrupo.add(checkQuadrinho);
        checkQuadrinho.setForeground(new java.awt.Color(255, 255, 255));
        checkQuadrinho.setText("Quadrinho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(txtInfos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovoLivro)
                                .addGap(31, 31, 31)
                                .addComponent(btnSalvarLivro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(labelQtdPaginas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(txtQtdPaginas, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDataPublicacao)
                                            .addComponent(labelIdade)
                                            .addComponent(txtFaixaEtaria, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(labelDataPublicacao))
                                        .addGap(21, 21, 21))
                                    .addComponent(labelAddAutor)
                                    .addComponent(labelAddEditora)
                                    .addComponent(dropAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dropEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(btnExcluirLivro))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkLivro)
                                            .addComponent(labelTipoObra)
                                            .addComponent(checkRevista)
                                            .addComponent(checkQuadrinho)))))
                            .addComponent(labelTitulo)
                            .addComponent(labelGenero)
                            .addComponent(labelIdioma)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnCancelar)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditarLivro))
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAddEditora1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPesquisarLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                    .addComponent(txtCampoPesquisa))))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblInfosEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelIdioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelQtdPaginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelDataPublicacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(labelIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFaixaEtaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAddAutor)
                        .addGap(8, 8, 8)
                        .addComponent(dropAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAddEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dropEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovoLivro)
                            .addComponent(btnSalvarLivro)
                            .addComponent(btnCancelar)
                            .addComponent(btnEditarLivro)
                            .addComponent(btnExcluirLivro))
                        .addGap(12, 12, 12)
                        .addComponent(labelAddEditora1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoObra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkLivro)
                        .addGap(12, 12, 12)
                        .addComponent(checkRevista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkQuadrinho)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarLivro))
                    .addComponent(btnPesquisarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(tblInfosEstoque, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInfosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInfosActionPerformed

    private void txtIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdiomaActionPerformed

    private void txtQtdPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdPaginasActionPerformed

    private void btnNovoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLivroActionPerformed
        botao = "novo";

        // Botoes
        btnNovoLivro.setEnabled(false);
        btnSalvarLivro.setEnabled(true);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnExcluirLivro.setEnabled(false);
        
        //spnIncrementaEstoque.setEnabled(true);
        
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCampoPesquisa.setEnabled(false);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(true);
        dropEditora.setEnabled(true);
        
        // Checkbox
        checkLivro.setEnabled(true);
        checkRevista.setEnabled(true);
        checkQuadrinho.setEnabled(true);
        
        // Textos
        txtTitulo.setEnabled(true);
        txtInfos.setEnabled(true);
        txtIdioma.setEnabled(true);
        txtQtdPaginas.setEnabled(true);
        txtFaixaEtaria.setEnabled(true);
        txtDataPublicacao.setEnabled(true);
        
        txtTitulo.requestFocus();
    }//GEN-LAST:event_btnNovoLivroActionPerformed

    private void btnSalvarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarLivroActionPerformed
        if(txtTitulo.getText().equals("") ||  txtInfos.getText().equals("") || txtIdioma.getText().equals("") || txtQtdPaginas.getText().equals("") || txtFaixaEtaria.getText().equals("") || txtDataPublicacao.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Mensagem", JOptionPane.PLAIN_MESSAGE); 
        } else {
            
            int selectedItemAutor = dropAutor.getSelectedIndex();
            int selectedItemEditora = dropEditora.getSelectedIndex();
            
            String tituloObra = txtTitulo.getText();
            String informacoesObra = txtInfos.getText();
            String idiomaObra = txtIdioma.getText();
            int paginasObra = Integer.parseInt(txtQtdPaginas.getText());
            int faixaEtariaObra = Integer.parseInt(txtFaixaEtaria.getText());
            String dataPublicacaoObra = txtDataPublicacao.getText();
            //int qtdLivrosEstoque = (int) spnIncrementaEstoque.getValue();
            
            Autor autorDaObra = listaAutores.get(selectedItemAutor);
            Editora editoraDaObra = listaEditoras.get(selectedItemEditora);
            
            String linh = informacoesObra + "|" + tituloObra + "|" + idiomaObra + "|" + paginasObra + "|" + faixaEtariaObra + "|" + dataPublicacaoObra + "|" + autorDaObra.getNome() + "|" + editoraDaObra.getNome() + "|";
            if (!tituloObra.equals(nomeAntigo) && BancoDeDados.in(tituloObra, "Bibliotecario", "NomeObras")){
                JOptionPane.showMessageDialog(null, "Já existe obra com mesmo nome. Tente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
                txtTitulo.requestFocus();
            }
            else if(botao.equals("novo")) {
                if(checkLivro.isSelected()) {
                    Livro livro = new Livro(informacoesObra, tituloObra, idiomaObra, paginasObra, faixaEtariaObra, dataPublicacaoObra, autorDaObra, editoraDaObra);
                    listaObras.add(livro);
                    tiposObras.add("Livro");
                    linh += "Livro";
                    BancoDeDados.escrever(linh, "Bibliotecario", "Obras");
                    BancoDeDados.escrever(tituloObra, "Bibliotecario", "NomeObras");
                    JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if(checkRevista.isSelected()) {
                    Revista revista = new Revista(informacoesObra, tituloObra, idiomaObra, paginasObra, faixaEtariaObra, dataPublicacaoObra, autorDaObra, editoraDaObra);
                    listaObras.add(revista);
                    tiposObras.add("Revista");
                    linh += "Quadrinho";
                    BancoDeDados.escrever(linh, "Bibliotecario", "Obras");
                    BancoDeDados.escrever(tituloObra, "Bibliotecario", "NomeObras");
                    JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    
                } else if(checkQuadrinho.isSelected()) {
                    Quadrinho quadrinho = new Quadrinho(informacoesObra, tituloObra, idiomaObra, paginasObra, faixaEtariaObra, dataPublicacaoObra, autorDaObra, editoraDaObra);
                    listaObras.add(quadrinho);
                    tiposObras.add("Quadrinho");
                    linh += "Quadrinho";
                    BancoDeDados.escrever(linh, "Bibliotecario", "Obras");
                    BancoDeDados.escrever(tituloObra, "Bibliotecario", "NomeObras");
                    JOptionPane.showMessageDialog(null, "Obra cadastrada com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha uma opção!", "Mensagem", JOptionPane.PLAIN_MESSAGE); 

                }
                
            } else if(botao.equals("editar")) {
                int index = tblEstoque.getSelectedRow();
                
                String btn = "";
                if (checkLivro.isSelected()){btn = "Livro";}
                else if (checkRevista.isSelected()){btn = "Revista";}
                else if (checkQuadrinho.isSelected()){btn = "Quadrinho";}
                
                if (!btn.equals("")){
                    listaObras.get(index).setTitulo(tituloObra);
                    listaObras.get(index).setInfosObras(informacoesObra);
                    listaObras.get(index).setIdioma(idiomaObra);
                    listaObras.get(index).setQntdPaginas(paginasObra);
                    listaObras.get(index).setFaixaEtaria(faixaEtariaObra);
                    listaObras.get(index).setDataPublicacao(dataPublicacaoObra);
                    listaObras.get(index).setTipo(btn);
                    listaObras.get(index).setAutor(autorDaObra);
                    listaObras.get(index).setEditora(editoraDaObra);

                    BancoDeDados.editaLinha(linhaAntiga, linh, "Bibliotecario", "Obras");
                    BancoDeDados.editaLinha(nomeAntigo, tituloObra, "Bibliotecario", "NomeObras");
                    JOptionPane.showMessageDialog(null, "Dados do livro editados com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Escolha uma opção!", "Mensagem", JOptionPane.PLAIN_MESSAGE); 
                }
                    

            }
            
            carregaTabelaObras();
            
            btnNovoLivro.setEnabled(true);
            btnSalvarLivro.setEnabled(false);
            btnEditarLivro.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnExcluirLivro.setEnabled(false);
            //spnIncrementaEstoque.setEnabled(false);
            btnPesquisarLivro.setEnabled(true);
            btnBuscarLivro.setEnabled(false);
            txtCampoPesquisa.setEnabled(false);

            // Dropdown ou Combobox
            dropAutor.setEnabled(false);
            dropEditora.setEnabled(false);

            // Checkbox
            checkLivro.setEnabled(false);
            checkRevista.setEnabled(false);
            checkQuadrinho.setEnabled(false);

            // Textos
            txtTitulo.setEnabled(false);
            txtInfos.setEnabled(false);
            txtIdioma.setEnabled(false);
            txtQtdPaginas.setEnabled(false);
            txtFaixaEtaria.setEnabled(false);
            txtDataPublicacao.setEnabled(false);
            
            // Limpando os campos de texto
            txtTitulo.setText("");
            txtInfos.setText("");
            txtIdioma.setText("");
            txtQtdPaginas.setText("");
            txtFaixaEtaria.setText("");
            txtDataPublicacao.setText("");
            //spnIncrementaEstoque.setValue(0);
            
        }
        
        
    }//GEN-LAST:event_btnSalvarLivroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Botoes
        btnNovoLivro.setEnabled(true);
        btnSalvarLivro.setEnabled(false);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluirLivro.setEnabled(false);
        //spnIncrementaEstoque.setEnabled(false);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCampoPesquisa.setEnabled(false);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(false);
        dropEditora.setEnabled(false);
        
        // Checkbox
        checkLivro.setEnabled(false);
        checkRevista.setEnabled(false);
        checkQuadrinho.setEnabled(false);
        
        // Textos
        txtTitulo.setEnabled(false);
        txtInfos.setEnabled(false);
        txtIdioma.setEnabled(false);
        txtQtdPaginas.setEnabled(false);
        txtFaixaEtaria.setEnabled(false);
        txtDataPublicacao.setEnabled(false);
        
        // Limpando os campos de texto
        txtTitulo.setText("");
        txtInfos.setText("");
        txtIdioma.setText("");
        txtQtdPaginas.setText("");
        txtFaixaEtaria.setText("");
        txtDataPublicacao.setText("");
        //spnIncrementaEstoque.setValue(0);
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroActionPerformed
        botao = "editar";
        
        btnNovoLivro.setEnabled(false);
        btnSalvarLivro.setEnabled(true);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnExcluirLivro.setEnabled(false);
        //spnIncrementaEstoque.setEnabled(true);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCampoPesquisa.setEnabled(false);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(true);
        dropEditora.setEnabled(true);

        
        // Checkbox
        checkLivro.setEnabled(true);
        checkRevista.setEnabled(true);
        checkQuadrinho.setEnabled(true);
        
        // Textos
        txtTitulo.setEnabled(true);
        txtInfos.setEnabled(true);
        txtIdioma.setEnabled(true);
        txtQtdPaginas.setEnabled(true);
        txtFaixaEtaria.setEnabled(true);
        txtDataPublicacao.setEnabled(true);
        
        int selectedItemAutor = dropAutor.getSelectedIndex();
        int selectedItemEditora = dropEditora.getSelectedIndex();
        Autor autorDaObra = listaAutores.get(selectedItemAutor);
        Editora editoraDaObra = listaEditoras.get(selectedItemEditora);
            
        String tituloObra = txtTitulo.getText();
        String informacoesObra = txtInfos.getText();
        String idiomaObra = txtIdioma.getText();
        int paginasObra = Integer.parseInt(txtQtdPaginas.getText());
        int faixaEtariaObra = Integer.parseInt(txtFaixaEtaria.getText());
        String dataPublicacaoObra = txtDataPublicacao.getText();
        String btn = "";
        
        if (checkLivro.isSelected()){btn = "Livro";}
        else if (checkRevista.isSelected()){btn = "Revista";}
        else {btn = "Quadrinho";}
        
        linhaAntiga = informacoesObra + "|" + tituloObra + "|" + idiomaObra + "|" + paginasObra + "|" + faixaEtariaObra + "|" + dataPublicacaoObra + "|" + autorDaObra.getNome() + "|" + editoraDaObra.getNome() + "|" + btn;
        nomeAntigo = tituloObra;
    }//GEN-LAST:event_btnEditarLivroActionPerformed

    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        int indexEE = tblEstoque.getSelectedRow();
        
        int selectedItemAutor = dropAutor.getSelectedIndex();
        int selectedItemEditora = dropEditora.getSelectedIndex();
        Autor autorDaObra = listaAutores.get(selectedItemAutor);
        Editora editoraDaObra = listaEditoras.get(selectedItemEditora);
            
        String tituloObra = txtTitulo.getText();
        String informacoesObra = txtInfos.getText();
        String idiomaObra = txtIdioma.getText();
        int paginasObra = Integer.parseInt(txtQtdPaginas.getText());
        int faixaEtariaObra = Integer.parseInt(txtFaixaEtaria.getText());
        String dataPublicacaoObra = txtDataPublicacao.getText();
        
        String btn = "";    
        if (checkLivro.isSelected()){btn = "Livro";}
        else if (checkRevista.isSelected()){btn = "Revista";}
        else {btn = "Quadrinho";}
        
        if(indexEE >= 0 && indexEE < listaEditoras.size()) {
            String linha = informacoesObra + "|" + tituloObra + "|" + idiomaObra + "|" + paginasObra + "|" + faixaEtariaObra + "|" + dataPublicacaoObra + "|" + autorDaObra.getNome() + "|" + editoraDaObra.getNome() + btn;
            BancoDeDados.excluiLinha(linha, "Bibliotecario", "Obras");
            BancoDeDados.excluiLinha(tituloObra, "Bibliotecario", "NomeObras");
            listaObras.remove(indexEE);
        }
        
        carregaTabelaObras();
        
        // Limpando os campos de texto
        txtTitulo.setText("");
        txtInfos.setText("");
        txtIdioma.setText("");
        txtQtdPaginas.setText("");
        txtFaixaEtaria.setText("");
        txtDataPublicacao.setText("");
        //spnIncrementaEstoque.setValue(0);
        
        // Botoes
        btnNovoLivro.setEnabled(true);
        btnSalvarLivro.setEnabled(false);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnExcluirLivro.setEnabled(false);
        //spnIncrementaEstoque.setEnabled(false);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCampoPesquisa.setEnabled(false);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(false);
        dropEditora.setEnabled(false);
        
        // Checkbox
        checkLivro.setEnabled(false);
        checkRevista.setEnabled(false);
        checkQuadrinho.setEnabled(false);
        
        // Textos
        txtTitulo.setEnabled(false);
        txtInfos.setEnabled(false);
        txtIdioma.setEnabled(false);
        txtQtdPaginas.setEnabled(false);
        txtFaixaEtaria.setEnabled(false);
        txtDataPublicacao.setEnabled(false);
        
        
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    private void txtFaixaEtariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaixaEtariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaixaEtariaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarLivroMouseClicked
        
    }//GEN-LAST:event_btnPesquisarLivroMouseClicked

    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
        if(listaObras.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma obra encontrada!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        
        // Limpando os campos de texto
        txtTitulo.setText("");
        txtInfos.setText("");
        txtIdioma.setText("");
        txtQtdPaginas.setText("");
        txtFaixaEtaria.setText("");
        txtDataPublicacao.setText("");
        //spnIncrementaEstoque.setValue(0);

         // Botoes
        btnNovoLivro.setEnabled(false);
        btnSalvarLivro.setEnabled(false);
        btnEditarLivro.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnExcluirLivro.setEnabled(false);
        //spnIncrementaEstoque.setEnabled(false);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(true);
        txtCampoPesquisa.setEnabled(true);
        
        // Dropdown ou Combobox
        dropAutor.setEnabled(false);
        dropEditora.setEnabled(false);
        
        // Checkbox
        checkLivro.setEnabled(false);
        checkRevista.setEnabled(false);
        checkQuadrinho.setEnabled(false);
        
        // Textos
        txtTitulo.setEnabled(false);
        txtInfos.setEnabled(false);
        txtIdioma.setEnabled(false);
        txtQtdPaginas.setEnabled(false);
        txtFaixaEtaria.setEnabled(false);
        txtDataPublicacao.setEnabled(false);
        
        txtCampoPesquisa.requestFocus();
        
        
    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

    private void btnBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLivroActionPerformed
        if(txtCampoPesquisa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um título válido!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else {
            Obra o;
            String titulo = "", information = "", lingua = "", datapubli = "";
            int pags = 0, faixaetaria = 0;
            String tituloBuscado = txtCampoPesquisa.getText();
            
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
                JOptionPane.showMessageDialog(null, "Nenhuma obra com esse título foi encontrada!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                
                txtTitulo.setText("");
                txtInfos.setText("");
                txtIdioma.setText("");
                txtQtdPaginas.setText("");
                txtFaixaEtaria.setText("");
                txtDataPublicacao.setText("");
                //spnIncrementaEstoque.setValue(0);
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
    }//GEN-LAST:event_btnBuscarLivroActionPerformed

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        int i = tblEstoque.getSelectedRow();
        
        if(i >= 0 && i < listaObras.size()) {
            Obra ob = listaObras.get(i);
            
            txtTitulo.setText(ob.getTitulo());
            txtInfos.setText(ob.getInfosObras());
            txtIdioma.setText(ob.getIdioma());
            txtQtdPaginas.setText(Integer.toString(ob.getQntdPaginas()));
            txtFaixaEtaria.setText(Integer.toString(ob.getFaixaEtaria()));
            txtDataPublicacao.setText(ob.getDataPublicacao());
            //spnIncrementaEstoque.setValue(estoque.get(i));
        }
        
        btnNovoLivro.setEnabled(false);
        btnSalvarLivro.setEnabled(true);
        btnEditarLivro.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnExcluirLivro.setEnabled(true);
        //spnIncrementaEstoque.setEnabled(false);
        btnPesquisarLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCampoPesquisa.setEnabled(false);
    }//GEN-LAST:event_tblEstoqueMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstoqueAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstoqueAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstoqueAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstoqueAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupo;
    private javax.swing.JButton btnBuscarLivro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarLivro;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JButton btnNovoLivro;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarLivro;
    private javax.swing.JRadioButton checkLivro;
    private javax.swing.JRadioButton checkQuadrinho;
    private javax.swing.JRadioButton checkRevista;
    private javax.swing.JComboBox<String> dropAutor;
    private javax.swing.JComboBox<String> dropEditora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAddAutor;
    private javax.swing.JLabel labelAddEditora;
    private javax.swing.JLabel labelAddEditora1;
    private javax.swing.JLabel labelDataPublicacao;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelQtdPaginas;
    private javax.swing.JLabel labelTipoObra;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JScrollPane tblInfosEstoque;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCampoPesquisa;
    private javax.swing.JFormattedTextField txtDataPublicacao;
    private javax.swing.JTextField txtFaixaEtaria;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtInfos;
    private javax.swing.JTextField txtQtdPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
