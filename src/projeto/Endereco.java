package projeto;

import java.util.ArrayList;


/**
 * Uma classe respons�vel por armazenar os dados do endere�o de entrega do cliente.
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
     * Cria um objeto Endere�o com nenhum atributo definido.
     */ 
    public Endereco() {
    }
    
    
    /**
     * Cria um objeto Endere�o com os atributos de cadastro inicializados.
     * @param cep O cep do endere��.
     * @param logradouro O logradouro do endere�o.
     * @param numero O n�mero do endere�o.
     * @param complemento Informa��o complementar que ajude a localiza��o do endere�o.
     * @param bairro O bairro do endere�o.
     * @param cidade A cidade do endere�o.
     * @param estado O estado do endere�o.
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
     * Obt�m o cep do endere�o.
     * @return Retorna o cep do endere�o.
     */
    public String getCep() {
        return cep;
    }
    
    
    /**
     * Obt�m o logradouro do endere�o.
     * @return Retorna o logradouro do endere�o.
     */
    public String getLogradouro() {
        return logradouro;
    }
    
    
    /**
     * Obt�m o numero do endere�o.
     * @return Retorna o numero do endere�o.
     */
    public String getNumero() {
        return numero;
    }
    
    
    /**
     * Obt�m o complemento do endere�o.
     * @return Retorna o complemento do endere�o.
     */
    public String getComplemento() {
        return complemento;
    }
    
    
    /**
     * Obt�m o bairro do endere�o.
     * @return Retorna o bairro do endere�o.
     */
    public String getBairro() {
        return bairro;
    }
    
    
    /**
     * Obt�m o cidade do endere�o.
     * @return Retorna o cidade do endere�o.
     */
    public String getCidade() {
        return cidade;
    }
    
    
    /**
     * Obt�m o estado do endere�o.
     * @return Retorna o estado do endere�o.
     */
    public String getEstado() {
        return estado;
    }
    
    
    /**
     * Obt�m uma lista com os cliente que compartilham esse endere�o.
     * @return Retorna uma lista dos clientes com o mesmo endere�o.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Define o cep do endere�o.
     * @param cep O cep do endere�o.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    /**
     * Define o logradouro do endere�o.
     * @param logradouro O logradouro do endere�o.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    
    /**
     * Define o numero do endere�o.
     * @param numero O numero do endere�o.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    /**
     * Define o complemento do endere�o.
     * @param complemento O complemento do endere�o.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    /**
     * Define o bairro do endere�o.
     * @param bairro O bairro do endere�o.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    /**
     * Define o cidade do endere�o.
     * @param cidade O cidade do endere�o.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    /**
     * Define o estado do endere�o.
     * @param estado O estado do endere�o.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    /**
     * Adiciona um cliente � lista de usu�rios deste endere�o.
     * @param cliente Um cliente que usa esse endere�o.
     */
    public void novoCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
}
