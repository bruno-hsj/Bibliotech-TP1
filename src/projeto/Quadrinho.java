package projeto;

import java.util.Calendar;

public class Quadrinho extends Obra{
    // Atributos
    private String ilustrador;
    
    // Construtores
    public Quadrinho() {
    }
    public Quadrinho(String ilustrador, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.ilustrador = ilustrador;
    }
    
    // Getters e Setters
    public String getIlustrador() {
        return ilustrador;
    }
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
}
