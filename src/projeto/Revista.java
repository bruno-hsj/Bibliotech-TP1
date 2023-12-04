package projeto;

/**
 * Uma classe referente a revistas de uma biblioteca.
 * @author netol
 */
public class Revista extends Obra{
    private String periodoPublicacao;
    private static String tipo = "Revista";
    /**
     * Cria um objeto do tipo Revista com nenhum atributo inicializado.
     */
    public Revista() {
    }
    
    
    /**
     * Cria um objeto Revista com os atributos de cadastro inicializados.
     * @param periodoPublicacao A frequ?ncia de publica??o da revista.
     * @param titulo O t?tulo do livro.
     * @param idioma O idioma que o livro foi escrito.
     * @param qntdPaginas A quantidade de p?ginas do livro.
     * @param faixaEtaria A faixa et?ria do livro.
     * @param dataPublicacao A data em que o livro foi publicado.
     * @param autor O autor do livro.
     * @param editora A editora que publicou o livro.
     */
    public Revista(String periodoPublicacao, String titulo, String idioma, int qntdPaginas, int faixaEtaria, String dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.periodoPublicacao = periodoPublicacao;
    }
    
    /**
     * Obtem a frequencia de publicacao da revista.
     * @return Retorna a frequ?ncia de publica??o da revista.
     */
    public String getPeriodoPublicacao() {
        return periodoPublicacao;
    }
    
    
    /**
     * Define a frequ?ncia de publica??o da revista.
     * @param periodoPublicacao A frequ?ncia de publica??o da revista.
     */
    public void setPeriodoPublicacao(String periodoPublicacao) {
        this.periodoPublicacao = periodoPublicacao;
    }
}