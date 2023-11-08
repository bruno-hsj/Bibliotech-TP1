package projeto;

import java.util.Calendar;

public class Obra {
    // Atributos
    private static int auxId;
    private String titulo;
    private String idioma;
    private int id;
    private int qntdPaginas;
    private int faixaEtaria;
    private Calendar dataPublicacao;
    private Autor autor;
    private Editora editora;
    
    // Construtor
    public Obra() {
    }
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
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQntdPaginas() {
        return qntdPaginas;
    }
    public void setQntdPaginas(int qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
    }
    public int getFaixaEtaria() {
        return faixaEtaria;
    }
    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    public Calendar getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(Calendar dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
