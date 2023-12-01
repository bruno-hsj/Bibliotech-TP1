package projeto;

import java.util.ArrayList;

/**
 * A classe Editora � respons�vel por refer�nciar editoras de lvrios e afins, e armazenar suas informa��es relevantes.
 * @author netol
 */
public class Editora {
    private String nome;
    private String paisOrigem;
    private String anoFundacao;
    private ArrayList<Obra> obras = new ArrayList();
    
    /**
     * Constr�i um objeto Editora com nenhum atributo inicializado.
     */
    public Editora() {
    }
    
    
    /**
     * Constr�i uum objeto Editora com os atributos de cadastro inicializados.
     * @param nome O nome da editora.
     * @param paisOrigem O pa�s em que a editora foi criada.
     * @param anoFundacao A data de funda��o da editora.
     */
    public Editora(String nome, String paisOrigem, String anoFundacao) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.anoFundacao = anoFundacao;
    }
    
    /**
     * Obt�m o nome da editora.
     * @return Retorna o nome da editora.
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * Obt�m o pa�s origem da editora.
     * @return Retorna o pa�s que a editora foi criada.
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }
    
    
    /**
     * Obt�m a data de cria��o da editora.
     * @return Retorna a data de funda��o da editora.
     */
    public String getAnoFundacao() {
        return anoFundacao;
    }
    
    
    /**
     * Obt�m uma lista com todas as obras publicadas pela editora.
     * @return Retorna uma lista com as publica��es da editora.
     */
    public ArrayList<Obra> getObras() {
        return obras;
    }
    
    
    /**
     * Define a data de cria��o da editora.
     * @param anoFundacao A data de funda��o da editora.
     */
    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    
    
    /**
     * Define o nome da editora.
     * @param nome O nome da editora.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    /**
     * Define o pa�s de origem da editora.
     * @param paisOrigem O pa�s de cria��o da editora.
     */
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    
    /**
     * Adiciona uma obra � lista de publica��es da editora.
     * @param obra Uma obra publicada pela editora.
     */
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
