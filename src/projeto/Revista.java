package projeto;

import java.util.Calendar;

public class Revista extends Obra{
    // Atributos
    private String periodoPublicacao;
    
    // Construtores
    public Revista() {
    }
    public Revista(String periodoPublicacao, String titulo, String idioma, int qntdPaginas, int faixaEtaria, Calendar dataPublicacao, Autor autor, Editora editora) {
        super(titulo, idioma, qntdPaginas, faixaEtaria, dataPublicacao, autor, editora);
        this.periodoPublicacao = periodoPublicacao;
    }
    
    // Getters e Setters
    public String getPeriodoPublicacao() {
        return periodoPublicacao;
    }
    public void setPeriodoPublicacao(String periodoPublicacao) {
        this.periodoPublicacao = periodoPublicacao;
    }
}
