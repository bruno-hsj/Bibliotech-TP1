package projeto;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 * Classe responsável por realizar operações e armazenar informações referentes ao cliente.
 * @author netol
 */
public class Cliente {
    private String usuario;
    private String senha;
    private String telefone;
    private String email;
    private String cpf;
    private String dataNascimento;
    private double saldo;
    private Endereco endereco;
    private ArrayList<Emprestimo> emprestimos = new ArrayList();
    
    /**
     * Cria um objeto Cliente com nenhum atributo inicializado.
     */
    public Cliente() {
    }
    
    
    /**
     * Cria um objeto Cliente com as informações de cadastro inicializadas.
     * @param usuario O usuario do cliente.
     * @param senha A senha do cliente.
     * @param telefone O número de telefone do cliente.
     * @param email O email do cliente.
     * @param cpf O cpf do cliente.
     * @param dataNascimento A data de nascimento do cliente.
     */
    public Cliente(String usuario, String senha, String telefone, String email, String cpf, String dataNascimento) {
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Obtém o usuário do cliente.
     * @return Retorna o usuário do cliente.
     */
    public String getUsuario() {
        return usuario;
    }
    
    
    /**
     * Obtém o telefone do cliente.
     * @return Retorna o telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * Obtém o email do cliente.
     * @return Retorna o email do cliente.
     */
    public String getEmail() {
        return email;
    }
    
    
    /**
     * Obtém o saldo do cliente.
     * @return Retorna o saldo do cliente.
     */
    public double getSaldo() {
        return saldo;
    }
    
    
    /**
     * Obtém uma lista com todos empréstimos ativos do cliente.
     * @return Retorna uma lista com os empréstimos feitos pelo cliente.
     */
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
    
    /**
     * Define o telefone do cliente.
     * @param telefone O telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    /**
     * Define o email do cliente.
     * @param email O email do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    /**
     * Define o usuário do cliente.
     * @param usuario O usuário do cliente.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    /**
     * Define a senha do cliente.
     * @param senha A senha do cliente.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    /**
     * Adiciona um empréstimo à lista de empréstimos do cliente.
     * @param emprestimo Um empréstimo feito pelo cliente.
     */
    public void novoEmprestimos(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);                   
    }
    
    
    /**
     * O método é responsável por renovar o empréstimo, extendendo seu prazo em um mês.
     * A extensão só será possível se ainda houver renovações disponíveis.
     * @param index A posição do empréstimo na lista de empréstimos.
     * @return Retorna true se conseguir renovar e false caso contrário.
     */
    public boolean renovarEmprestimo(int index){
        Emprestimo emprestimo = emprestimos.get(index);    
        if (emprestimo.getQntdRenovacoes() > 0){            
            emprestimo.extendePrazo();              
            emprestimos.set(index, emprestimo);     
            return true;                                 
        }
        return false;                                       
    }
    
    
    /**
     * O método verifica o status da multa de um empréstimo escolhido.
     * @param index A posição do empréstimo na lista de empréstimos.
     * @return Retorna true se houver multa ativa e false caso contrário.
     */
    public boolean verificarMulta(int index){
        return emprestimos.get(index).getMulta().getStatusMulta();                  
    }
    
    
    /**
     * Aumenta o saldo do cliente pelo total passado como parâmetro.
     * @param valor O valor que será depositado.
     */
    public void depositar(double valor){
        if (valor > 0)
            saldo += valor;                
    }
    
    
    /**
     * Paga o valor da multa de um empréstimo escolhido.
     * Só será possível pagá-la se houver multa ativa, e se o saldo for maior que a multa.
     * Após pagar a multa o empréstimo é encerrado e o valor da multa é debitado no saldo.
     * @param index A posição do empréstimo na lista de empréstimos.
     */
    public void pagarMulta(int index){
        Multa multa = this.emprestimos.get(index).getMulta();
        if (this.verificarMulta(index) && saldo >= multa.getValorMulta()){
            saldo -= multa.getValorMulta();                                         
            emprestimos.remove(index);                                           
        }
    }
    
    
    /**
     * Devolve o livro e encerra o empréstimo.
     * A devolução só será possível se não houver multa ativa.
     * @param index 
     */
    public void devolverLivro(int index){
        if (this.verificarMulta(index) == false)           
            emprestimos.remove(index);                                         
    }
    
    /**
     * Calcula a idade do cliente à partir da data de nascimento cadastrada.
     * @return Retorna a idade do cliente.
     */
    public int calculaIdade(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(this.dataNascimento, formatter);
        LocalDate atual = LocalDate.now();
        Period idade = Period.between(data , atual);
        return idade.getYears();
    }
}
