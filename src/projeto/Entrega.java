package projeto;


/**
 * Classe responsável por relacionar um empréstimo com um endereço de um cliente.
 * @author netol
 */
public class Entrega {
    private static double frete = 5;
    private Endereco endereco;
    private Emprestimo emprestimo;
    
    /**
     * Cria um objeto do tipo Entrega com nenhum atributo inicializado.
     */
    public Entrega() {
    }
    
    
    /**
     * Cria um objeto do tipo Entrega com um objeto Endereço relacionado.
     * @param endereco Um objeto Endereço.
     */
    public Entrega(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    /**
     * Obtém o valor do frete.
     * @return Retorna o valor do frete.
     */
    public static double getFrete() {
        return frete;
    }
    
    
    /**
     * Obtém o endereço associado.
     * @return Retorna o endereço associado à entrega.
     */
    public Endereco getEndereco() {
        return endereco;
    }
    
    
    /**
     * Define o endereço da entrega.
     * @param endereco Um objeto endereço relacionado à entrega.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    /**
     * Obtém o objeto empréstimo a que se refere a entrega.
     * @return Retorna o empréstimo associado à entrega.
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    
    /**
     * Define o empréstimo ligado à entrega.
     * @param emprestimo Um objeto empréstimo.
     */
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
