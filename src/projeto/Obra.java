package projeto;

import java.util.Calendar;


/**
 * Uma classe que se refere à obras de uma biblioteca.
 * @author netol
 */
public class Obra {
    private static int auxId;
    private String titulo;
    private String idioma;
    private int id;
    private int qntdPaginas;
    private int faixaEtaria;
    private Calendar dataPublicacao;
    private Autor autor;
    private Editora editora;
    
    /**
     * Cria um objeto Obra com nenhum atributo inicializado.
     */
    public Obra() {
    }
    
    
    /**
     * Cria um objeto Obra com os atributos de cadastro inicializados.
     * @param titulo O título da obra.
     * @param idioma O idioma que a obra foi escrita.
     * @param qntdPaginas A quantidade de páginas da obra.
     * @param faixaEtaria A faixa etária da obra.
     * @param dataPublicacao A data que a obra foi publicada.
     * @param autor O autor da obra.
     * @param editora A editora que publicou a obra.
     */
    public Obra(String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.qntdPaginas = qntdPaginas;
        this.faixaEtaria = faixaEtaria;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.editora = editora;
        id = auxId;         // toda vez que um objeto livro é construido o id atual vai ser diferente do anterior em 1
        auxId ++;           // aumenta o valor do proximo id em 1
    }
    
    
    /**
     * Obtém o título da obra.
     * @return Retorna o título da obra.
     */
    public String getTitulo() {
        return titulo;
    }
    
    
    /**
     * Define o título da obra.
     * @param titulo O título da obra.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    /**
     * Obtém o idioma da obra.
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
     * Obtém o id da obra.
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
     * Obtém a quantidade de páginas da obra.
     * @return Retorna a quantidade de páginas da obra.
     */
    public int getQntdPaginas() {
        return qntdPaginas;
    }
    
    
    /**
     * Define a quantidade de páginas da obra 
     * @param qntdPaginas A quantidade de páginas da obra.
     */
    public void setQntdPaginas(int qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
    }
    
    
    /**
     * Obtém a faixa etária da obra.
     * @return Retorna a faixa etária da obra.
     */
    public int getFaixaEtaria() {
        return faixaEtaria;
    }
    
    
    /**
     * Define a faixa etária da obra.
     * @param faixaEtaria A faixa etária da obra.
     */
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    
    /**
     * Obtém a data de publicação da obra.
     * @return Retorna a data de publicação da obra.
     */
    public Calendar getDataPublicacao() {
        return dataPublicacao;
    }
    
    
    /**
     * Define a data de publicação da obra.
     * @param dataPublicacao  A data de publicação da obra.
     */
    public void setDataPublicacao(Calendar dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
