package projeto;

import java.util.ArrayList;

/**
 * A classe Editora é responsável por referênciar editoras de lvrios e afins, e armazenar suas informações relevantes.
 * @author netol
 */
public class Editora {
    private String nome;
    private String paisOrigem;
    private String anoFundacao;
    private ArrayList<Obra> obras = new ArrayList();
    
    /**
     * Constrói um objeto Editora com nenhum atributo inicializado.
     */
    public Editora() {
    }
    
    
    /**
     * Constrói uum objeto Editora com os atributos de cadastro inicializados.
     * @param nome O nome da editora.
     * @param paisOrigem O país em que a editora foi criada.
     * @param anoFundacao A data de fundação da editora.
     */
    public Editora(String nome, String paisOrigem, String anoFundacao) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.anoFundacao = anoFundacao;
    }
    
    /**
     * Obtém o nome da editora.
     * @return Retorna o nome da editora.
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * Obtém o país origem da editora.
     * @return Retorna o país que a editora foi criada.
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }
    
    
    /**
     * Obtém a data de criação da editora.
     * @return Retorna a data de fundação da editora.
     */
    public String getAnoFundacao() {
        return anoFundacao;
    }
    
    
    /**
     * Obtém uma lista com todas as obras publicadas pela editora.
     * @return Retorna uma lista com as publicações da editora.
     */
    public ArrayList<Obra> getObras() {
        return obras;
    }
    
    
    /**
     * Define a data de criação da editora.
     * @param anoFundacao A data de fundação da editora.
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
     * Define o país de origem da editora.
     * @param paisOrigem O país de criação da editora.
     */
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    
    /**
     * Adiciona uma obra à lista de publicações da editora.
     * @param obra Uma obra publicada pela editora.
     */
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
