package projeto;

/**
 * Uma classe que se refere a obras de uma biblioteca.
 * @author netol
 */
public class Obra {
    private static int auxId;
    private String titulo;
    private String idioma;
    private int id;
    private int qntdPaginas;
    private int faixaEtaria;
    private String dataPublicacao;
    private String infosObras;
    private Autor autor;
    private Editora editora;
    public String tipo;
    
    /**
     * Cria um objeto Obra com nenhum atributo inicializado.
     */
    public Obra() {
    }
    
    
    /**
     * Cria um objeto Obra com os atributos de cadastro inicializados.
     * @param infos A informação da obra.
     * @param titulo O titulo da obra.
     * @param idioma O idioma que a obra foi escrita.
     * @param qntdPaginas A quantidade de paginas da obra.
     * @param faixaEtaria A faixa etaria da obra.
     * @param dataPublicacao A data que a obra foi publicada.
     * @param autor O autor da obra.
     * @param editora A editora que publicou a obra.
     * @param tipo O tipo de obra.
     */
    public Obra(String infos, String titulo, String idioma, int qntdPaginas, int faixaEtaria, String dataPublicacao, Autor autor, Editora editora, String tipo) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.qntdPaginas = qntdPaginas;
        this.faixaEtaria = faixaEtaria;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.infosObras = infos;
        this.tipo = tipo;
        id = auxId;        
        auxId ++;           
    }
    
    
    /**
     * Cria um objeto Obra com os atributos de cadastro inicializados.
     * @param titulo O titulo da obra.
     * @param idioma O idioma que a obra foi escrita.
     * @param qntdPaginas A quantidade de paginas da obra.
     * @param faixaEtaria A faixa etaria da obra.
     * @param dataPublicacao A data que a obra foi publicada.
     * @param autor O autor da obra.
     * @param editora A editora que publicou a obra.
     */
    public Obra(String titulo, String idioma, int qntdPaginas, int faixaEtaria, String dataPublicacao, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.qntdPaginas = qntdPaginas;
        this.faixaEtaria = faixaEtaria;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.editora = editora;
        id = auxId;        
        auxId ++;           
    }
    
    
    /**
     * Obtem o titulo da obra.
     * @return Retorna o titulo da obra.
     */
    public String getTitulo() {
        return titulo;
    }
    
    
    /**
     * Define o titulo da obra.
     * @param titulo O titulo da obra.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    /**
     * Obtem o idioma da obra.
     * @return Retorna o idioma da obra.
     */
    public String getIdioma() {
        return idioma;
    }
    
    
    /**
     * Define o idioma da obra.
     * @param idioma O idioma da obra.
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    /**
     * Obtem o id da obra.
     * @return Retorna o id da obra.
     */
    public int getId() {
        return id;
    }
    
    
    /**
     * Define o id da obra.
     * @param id O id da obra.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    /**
     * Obt?m a quantidade de p?ginas da obra.
     * @return Retorna a quantidade de p?ginas da obra.
     */
    public int getQntdPaginas() {
        return qntdPaginas;
    }
    
    
    /**
     * Define a quantidade de p?ginas da obra 
     * @param qntdPaginas A quantidade de p?ginas da obra.
     */
    public void setQntdPaginas(int qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
    }
    
    
    /**
     * Obt?m a faixa et?ria da obra.
     * @return Retorna a faixa et?ria da obra.
     */
    public int getFaixaEtaria() {
        return faixaEtaria;
    }
    
    
    /**
     * Define a faixa et?ria da obra.
     * @param faixaEtaria A faixa et?ria da obra.
     */
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    
    /**
     * Obt?m a data de publica??o da obra.
     * @return Retorna a data de publica??o da obra.
     */
    public String getDataPublicacao() {
        return dataPublicacao;
    }
    
    
    /**
     * Define a data de publica??o da obra.
     * @param dataPublicacao  A data de publica??o da obra.
     */
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
    /**
     * Obtém as informações da obra.
     * @return infosObras As informações adicionais das obras (pode ser ilustrador, data de publicação ou gênero literário).
     */
    public String getInfosObras() {
        return infosObras;
    }
    
    /**
     * Define as informações da obra.
     * @param infosObras As informações adicionais das obras (pode ser ilustrador, data de publicação ou gênero literário).
     */
    public void setInfosObras(String infosObras) {
        this.infosObras = infosObras;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void mostrar(){
        String resultado;
        resultado = infosObras + "" + titulo + "" + idioma + "" + qntdPaginas + "" + faixaEtaria + "" + dataPublicacao + "" + autor.getNome() + "" + editora.getNome() + "" + tipo; 
        System.out.println(resultado);
    }
        
}