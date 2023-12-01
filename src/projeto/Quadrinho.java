package projeto;

import java.util.Calendar;


/**
 * Uma classe referente a quadrinhos de uma biblioteca.
 * @author netol
 */
public class Quadrinho extends Obra{
    private String ilustrador;
    
    /**
     * Cria um objeto do tipo Quadrinho com nenhum atributo inicializado.
     */
    public Quadrinho() {
    }
    
    
    /**
     * Cria um objeto quadrinho com os atributos de cadastro inicializados.
     * @param ilustrador O ilustrador do quadrinho.
     * @param titulo O título do livro.
     * @param idioma O idioma que o livro foi escrito.
     * @param qntdPaginas A quantidade de páginas do livro.
     * @param faixaEtaria A faixa etária do livro.
     * @param dataPublicacao A data em que o livro foi publicado.
     * @param autor O autor do livro.
     * @param editora A editora que publicou o livro.
     */ 
    public Quadrinho(String ilustrador, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.ilustrador = ilustrador;
    }
    
    /**
     * O]Obtém o ilustrador do quadrinho.
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
