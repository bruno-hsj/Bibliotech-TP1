package projeto;

import java.util.Calendar;

public class Livro extends Obra{
    // Atributos
    private String generoLiterario;

    // Construtores
    public Livro() {
    }
    public Livro(String generoLiterario, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.generoLiterario = generoLiterario;
    }

    // Getters e Setters
    public String getGeneroLiterario() {
        return generoLiterario;
    }
    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }
    
    
}
