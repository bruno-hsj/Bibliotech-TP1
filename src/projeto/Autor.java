package projeto;

import java.util.ArrayList;

/**
 * A classe Autor � respons�vel por refer�nciar autores de obras, e armazenar suas informa��es relevantes.
 * @author netol
 */
public class Autor {
    private String nome;
    private String nacionalidade;
    private String dataNascimento;
    private ArrayList<Obra> obras = new ArrayList();
    

    
    /**
     * Cria um objeto do tipo Autor sem nenhum atributo inicializado.
     */
    public Autor() {
    }
    
    
    /**
     * Cria um objeto do tipo autor, definindo seu nome, nascionalidade e data de nascimento.
     * @param nome O nome do autor.
     * @param nacionalidade Em qual pa�s o autor nasceu.
     * @param dataNascimento Quando o autor nasceu.
     */
    public Autor(String nome, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }
    
   
    /**
     * Obt�m o nome do autor em quest�o.
     * @return Retorna o nome do autor.
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * Obt�m a nacionalidade do autor.
     * @return Retorna em qual pa�s o autor nasceu.
     */
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    
    /**
     * Obt�m a data de nascimento do autor.
     * @return Retorna quando o autor nasceu.
     */
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
    /**
     * Obt�m uma lista com todas as obras desenvolvidas por este autor.
     * @return Retorna um ArrayList com as obras produzidas pelo autor. 
     */
    public ArrayList<Obra> getObras() {
        return obras;
    }
    
    
    /**
     * Define o nome do autor.
     * @param nome O nome do autor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    /**
     * Define em qual pa�s o autor nasceu.
     * @param nacionalidade Qual a nascionalidade do autor.
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
    /**
     * Define quando o autor nasceu.
     * @param dataNascimento A data de nascimento do autor.
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    /**
     * Adiciona uma obra � lista de produ��es do autor.
     * @param obra A obra que o ator fez.
     */
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
