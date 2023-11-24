package projeto;

import java.util.ArrayList;

public class Autor {
    // Atributos
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    private ArrayList<Obra> obras = new ArrayList();
    
    private ArrayList<Autor> autores;
    
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores  = autores;
    }
    
    // Construtores
    public Autor() {
    }
    public Autor(String nome, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public ArrayList<Obra> getObras() {
        return obras;
    }
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
