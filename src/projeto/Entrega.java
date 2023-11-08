package projeto;

public class Entrega {
    private static double frete = 5;
    private Endereco endereco;
    private Emprestimo emprestimo;
    
    // Construtores
    public Entrega() {
    }
    public Entrega(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // Getters e Setters
    public static double getFrete() {
        return frete;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
