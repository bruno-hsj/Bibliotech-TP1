package projeto;


/**
 * Classe respons�vel por relacionar um empr�stimo com um endere�o de um cliente.
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
     * Cria um objeto do tipo Entrega com um objeto Endere�o relacionado.
     * @param endereco Um objeto Endere�o.
     */
    public Entrega(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    /**
     * Obt�m o valor do frete.
     * @return Retorna o valor do frete.
     */
    public static double getFrete() {
        return frete;
    }
    
    
    /**
     * Obt�m o endere�o associado.
     * @return Retorna o endere�o associado � entrega.
     */
    public Endereco getEndereco() {
        return endereco;
    }
    
    
    /**
     * Define o endere�o da entrega.
     * @param endereco Um objeto endere�o relacionado � entrega.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    /**
     * Obt�m o objeto empr�stimo a que se refere a entrega.
     * @return Retorna o empr�stimo associado � entrega.
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    
    /**
     * Define o empr�stimo ligado � entrega.
     * @param emprestimo Um objeto empr�stimo.
     */
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
