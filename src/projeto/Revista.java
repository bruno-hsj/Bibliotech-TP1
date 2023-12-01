package projeto;

import java.util.Calendar;


/**
 * Uma classe referente a revistas de uma biblioteca.
 * @author netol
 */
public class Revista extends Obra{
    private String periodoPublicacao;
    
    /**
     * Cria um objeto do tipo Revista com nenhum atributo inicializado.
     */
    public Revista() {
    }
    
    
    /**
     * Cria um objeto Revista com os atributos de cadastro inicializados.
     * @param periodoPublicacao A frequência de publicação da revista.
     * @param titulo O título do livro.
     * @param idioma O idioma que o livro foi escrito.
     * @param qntdPaginas A quantidade de páginas do livro.
     * @param faixaEtaria A faixa etária do livro.
     * @param dataPublicacao A data em que o livro foi publicado.
     * @param autor O autor do livro.
     * @param editora A editora que publicou o livro.
     */
    public Revista(String periodoPublicacao, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.periodoPublicacao = periodoPublicacao;
    }
    
    /**
     * Obtém a frequência de publicação da revista.
     * @return Retorna a frequência de publicação da revista.
     */
    public String getPeriodoPublicacao() {
        return periodoPublicacao;
    }
    
    
    /**
     * Define a frequência de publicação da revista.
     * @param periodoPublicacao A frequência de publicação da revista.
     */
    public void setPeriodoPublicacao(String periodoPublicacao) {
        this.periodoPublicacao = periodoPublicacao;
    }
}
