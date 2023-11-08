package projeto;

import java.util.ArrayList;
import java.util.Calendar; 

public class Editora {
    // Atributos
    private String nome;
    private String paisOrigem;
    private Calendar anoFundacao;
    private ArrayList<Obra> obras = new ArrayList();
    
    // Construtores
    public Editora() {
    }
    public Editora(String nome, String paisOrigem, Calendar anoFundacao) {
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
    public Calendar getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(Calendar anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public ArrayList<Obra> getObras() {
        return obras;
    }
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
