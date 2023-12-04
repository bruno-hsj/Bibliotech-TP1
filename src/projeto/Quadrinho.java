package projeto;


/**
 * Uma classe referente a quadrinhos de uma biblioteca.
 * @author netol
 */
public class Quadrinho extends Obra{
    private String ilustrador;
    private static String tipo = "Quadrinho";
    
    /**
     * Cria um objeto do tipo Quadrinho com nenhum atributo inicializado.
     */
    public Quadrinho() {
    }
    
    
    /**
     * Cria um objeto quadrinho com os atributos de cadastro inicializados.
     * @param ilustrador O ilustrador do quadrinho.
     * @param titulo O t?tulo do livro.
     * @param idioma O idioma que o livro foi escrito.
     * @param qntdPaginas A quantidade de p?ginas do livro.
     * @param faixaEtaria A faixa et?ria do livro.
     * @param dataPublicacao A data em que o livro foi publicado.
     * @param autor O autor do livro.
     * @param editora A editora que publicou o livro.
     */ 
    public Quadrinho(String ilustrador, String titulo, String idioma, int qntdPaginas, int faixaEtaria, String dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.ilustrador = ilustrador;
    }
    
    /**
     * O]Obt?m o ilustrador do quadrinho.
     * @return Retorna o ilustrador do quadrinho.
     */
    public String getIlustrador() {
        return ilustrador;
    }
    
    
    /**
     * Define o ilustrador do quadrinho.
     * @param ilustrador O ilustrador do quadrinho.
     */
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
}