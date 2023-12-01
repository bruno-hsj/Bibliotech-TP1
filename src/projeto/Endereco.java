package projeto;

import java.util.ArrayList;


/**
 * Uma classe responsável por armazenar os dados do endereço de entrega do cliente.
 * @author netol
 */
class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private ArrayList<Cliente> clientes = new ArrayList();

    /**
     * Cria um objeto Endereço com nenhum atributo definido.
     */ 
    public Endereco() {
    }
    
    
    /**
     * Cria um objeto Endereço com os atributos de cadastro inicializados.
     * @param cep O cep do endereçõ.
     * @param logradouro O logradouro do endereço.
     * @param numero O número do endereço.
     * @param complemento Informação complementar que ajude a localização do endereço.
     * @param bairro O bairro do endereço.
     * @param cidade A cidade do endereço.
     * @param estado O estado do endereço.
     */
    public Endereco(String cep, String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * Obtém o cep do endereço.
     * @return Retorna o cep do endereço.
     */
    public String getCep() {
        return cep;
    }
    
    
    /**
     * Obtém o logradouro do endereço.
     * @return Retorna o logradouro do endereço.
     */
    public String getLogradouro() {
        return logradouro;
    }
    
    
    /**
     * Obtém o numero do endereço.
     * @return Retorna o numero do endereço.
     */
    public String getNumero() {
        return numero;
    }
    
    
    /**
     * Obtém o complemento do endereço.
     * @return Retorna o complemento do endereço.
     */
    public String getComplemento() {
        return complemento;
    }
    
    
    /**
     * Obtém o bairro do endereço.
     * @return Retorna o bairro do endereço.
     */
    public String getBairro() {
        return bairro;
    }
    
    
    /**
     * Obtém o cidade do endereço.
     * @return Retorna o cidade do endereço.
     */
    public String getCidade() {
        return cidade;
    }
    
    
    /**
     * Obtém o estado do endereço.
     * @return Retorna o estado do endereço.
     */
    public String getEstado() {
        return estado;
    }
    
    
    /**
     * Obtém uma lista com os cliente que compartilham esse endereço.
     * @return Retorna uma lista dos clientes com o mesmo endereço.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Define o cep do endereço.
     * @param cep O cep do endereço.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    /**
     * Define o logradouro do endereço.
     * @param logradouro O logradouro do endereço.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    
    /**
     * Define o numero do endereço.
     * @param numero O numero do endereço.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    /**
     * Define o complemento do endereço.
     * @param complemento O complemento do endereço.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    /**
     * Define o bairro do endereço.
     * @param bairro O bairro do endereço.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    /**
     * Define o cidade do endereço.
     * @param cidade O cidade do endereço.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    /**
     * Define o estado do endereço.
     * @param estado O estado do endereço.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    /**
     * Adiciona um cliente à lista de usuários deste endereço.
     * @param cliente Um cliente que usa esse endereço.
     */
    public void novoCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
}
