package projeto;

import java.util.ArrayList;

public class Editora {
    // Atributos
    private String nome;
    private String paisOrigem;
    private String anoFundacao;
    private ArrayList<Obra> obras = new ArrayList();
    
    private ArrayList<Editora> editoras;
    
    public ArrayList<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(ArrayList<Editora> editoras) {
        this.editoras  = editoras;
    }
    
    // Construtores
    public Editora() {
    }
    public Editora(String nome, String paisOrigem, String anoFundacao) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.anoFundacao = anoFundacao;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public String getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public ArrayList<Obra> getObras() {
        return obras;
    }
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
