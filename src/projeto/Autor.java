package projeto;

import java.util.ArrayList;
import java.util.Calendar;

public class Autor {
    // Atributos
    private String nome;
    private String nacionalidade;
    private Calendar dataNascimento;
    private ArrayList<Obra> obras = new ArrayList();
    
    // Construtores
    public Autor() {
    }
    public Autor(String nome, String nacionalidade, Calendar dataNascimento) {
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
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public ArrayList<Obra> getObras() {
        return obras;
    }
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
