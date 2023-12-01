package projeto;

import java.util.Calendar;

/**
 * Uma classe referente à livros de uma biblioteca.
 * @author netol
 */
public class Livro extends Obra{
    private String generoLiterario;

    /**
     * Cria um objeto Livro com nenhum atributo inicializado.
     */
    public Livro() {
    }
    
    
    /**
     * Cria um objeto Livro com os atributos de cadastro inicializados.
     * @param generoLiterario O gênero do livro.
     * @param titulo O título do livro.
     * @param idioma O idioma que o livro foi escrito.
     * @param qntdPaginas A quantidade de páginas do livro.
     * @param faixaEtaria A faixa etária do livro.
     * @param dataPublicacao A data em que o livro foi publicado.
     * @param autor O autor do livro.
     * @param editora A editora que publicou o livro.
     */
    public Livro(String generoLiterario, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.generoLiterario = generoLiterario;
    }

    
    /**
     * Obtém o genêro do livro.
     * @return Retorna o gênero do livro.
     */
    public String getGeneroLiterario() {
        return generoLiterario;
    }
    
    
    /**
     * Define o gênero do livro.
     * @param generoLiterario O gênero do livro. 
     */
    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

   
}
