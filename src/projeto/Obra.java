package projeto;

/**
 * Uma classe que se refere ? obras de uma biblioteca.
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
    String infosObras;
    private Autor autor;
    private Editora editora;
    
    /**
     * Cria um objeto Obra com nenhum atributo inicializado.
     */
    public Obra() {
    }
    
    
    /**
     * Cria um objeto Obra com os atributos de cadastro inicializados.
     * @param titulo O t?tulo da obra.
     * @param idioma O idioma que a obra foi escrita.
     * @param qntdPaginas A quantidade de p?ginas da obra.
     * @param faixaEtaria A faixa et?ria da obra.
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
        id = auxId;         // toda vez que um objeto livro ? construido o id atual vai ser diferente do anterior em 1
        auxId ++;           // aumenta o valor do proximo id em 1
    }
    
    
    /**
     * Obt?m o t?tulo da obra.
     * @return Retorna o t?tulo da obra.
     */
    public String getTitulo() {
        return titulo;
    }
    
    
    /**
     * Define o t?tulo da obra.
     * @param titulo O t?tulo da obra.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    /**
     * Obt?m o idioma da obra.
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
     * Obt?m o id da obra.
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
}