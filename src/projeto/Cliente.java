package projeto;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
    // Atributos
    private Calendar dataNascimento;
    private String usuario;
    private String senha;
    private String telefone;
    private String email;
    private String cpf;
    private double saldo;
    private ArrayList<Emprestimo> emprestimos = new ArrayList();
    private Endereco endereco;
    
    // Construtores
    public Cliente() {
    }
    public Cliente(String usuario, String senha, String telefone, String email) {
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }
    
    // Getters e Setters
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public void novoEmprestimos(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);                    // adiciona um empréstimo na lista de emprestimos do cliente
    }
    
    // Métodos
    public boolean renovarEmprestimo(int index){
        Emprestimo emprestimo = emprestimos.get(index);     // emprestimo = lista[index]
        if (emprestimo.getQntdRenovacoes() > 0){            // se não tiver passado do limite de renovações
            emprestimo.extendePrazo();                 // extende a data limite em um mês
            emprestimos.set(index, emprestimo);      // lista[index] = emprestimo
            return true;                                    // conseguiu renovar
        }
        return false;                                       // não conseguiu renovar
    }
    public boolean verificarMulta(int index){
        return emprestimos.get(index).getMulta().getStatusMulta();                  // retorna true se houver multa
    }
    public void depositar(double valor){
        if (valor > 0)
            saldo += valor;                                                         // aumenta o valor do saldo
    }
    public void pagarMulta(int index){
        Emprestimo emprestimo = emprestimos.get(index);                             // emprestimo = lista[index]
        Multa multa = emprestimo.getMulta();                                        // multa = multa do empréstimo
        if ((saldo >= multa.getValorMulta()) && (multa.getStatusMulta() == true)){  // se houver multa e o saldo for maior que a multa
            saldo -= multa.getValorMulta();                                         // debita do saldo o valor da multa
            emprestimos.remove(index);                                              // exclui o empréstimo (devolveu o livro)
        }
    }
    public void devolverLivro(int index){
        if (emprestimos.get(index).getMulta().getStatusMulta() == false)            // se não houver multa
            emprestimos.remove(index);                                              // exclui o empréstimo (devolveu o livro)
    }
}
