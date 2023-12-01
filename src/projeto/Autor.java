package projeto;

import java.util.ArrayList;

/**
 * A classe Autor é responsável por referênciar autores de obras, e armazenar suas informações relevantes.
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
     * @param nacionalidade Em qual país o autor nasceu.
     * @param dataNascimento Quando o autor nasceu.
     */
    public Autor(String nome, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }
    
   
    /**
     * Obtém o nome do autor em questão.
     * @return Retorna o nome do autor.
     */
    public String getNome() {
        return nome;
    }
    
    
    /**
     * Obtém a nacionalidade do autor.
     * @return Retorna em qual país o autor nasceu.
     */
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    
    /**
     * Obtém a data de nascimento do autor.
     * @return Retorna quando o autor nasceu.
     */
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    
    /**
     * Obtém uma lista com todas as obras desenvolvidas por este autor.
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
     * Define em qual país o autor nasceu.
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
     * Adiciona uma obra à lista de produções do autor.
     * @param obra A obra que o ator fez.
     */
    public void novaObra(Obra obra) {
        obras.add(obra);
    }
}
