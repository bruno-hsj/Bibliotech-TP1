package projeto;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 * Classe respons�vel por realizar opera��es e armazenar informa��es referentes ao cliente.
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
     * Cria um objeto Cliente com as informa��es de cadastro inicializadas.
     * @param usuario O usuario do cliente.
     * @param senha A senha do cliente.
     * @param telefone O n�mero de telefone do cliente.
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
     * Obt�m o usu�rio do cliente.
     * @return Retorna o usu�rio do cliente.
     */
    public String getUsuario() {
        return usuario;
    }
    
    
    /**
     * Obt�m o telefone do cliente.
     * @return Retorna o telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * Obt�m o email do cliente.
     * @return Retorna o email do cliente.
     */
    public String getEmail() {
        return email;
    }
    
    
    /**
     * Obt�m o saldo do cliente.
     * @return Retorna o saldo do cliente.
     */
    public double getSaldo() {
        return saldo;
    }
    
    
    /**
     * Obt�m uma lista com todos empr�stimos ativos do cliente.
     * @return Retorna uma lista com os empr�stimos feitos pelo cliente.
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
     * Define o usu�rio do cliente.
     * @param usuario O usu�rio do cliente.
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
     * Adiciona um empr�stimo � lista de empr�stimos do cliente.
     * @param emprestimo Um empr�stimo feito pelo cliente.
     */
    public void novoEmprestimos(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);                   
    }
    
    
    /**
     * O m�todo � respons�vel por renovar o empr�stimo, extendendo seu prazo em um m�s.
     * A extens�o s� ser� poss�vel se ainda houver renova��es dispon�veis.
     * @param index A posi��o do empr�stimo na lista de empr�stimos.
     * @return Retorna true se conseguir renovar e false caso contr�rio.
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
     * O m�todo verifica o status da multa de um empr�stimo escolhido.
     * @param index A posi��o do empr�stimo na lista de empr�stimos.
     * @return Retorna true se houver multa ativa e false caso contr�rio.
     */
    public boolean verificarMulta(int index){
        return emprestimos.get(index).getMulta().getStatusMulta();                  
    }
    
    
    /**
     * Aumenta o saldo do cliente pelo total passado como par�metro.
     * @param valor O valor que ser� depositado.
     */
    public void depositar(double valor){
        if (valor > 0)
            saldo += valor;                
    }
    
    
    /**
     * Paga o valor da multa de um empr�stimo escolhido.
     * S� ser� poss�vel pag�-la se houver multa ativa, e se o saldo for maior que a multa.
     * Ap�s pagar a multa o empr�stimo � encerrado e o valor da multa � debitado no saldo.
     * @param index A posi��o do empr�stimo na lista de empr�stimos.
     */
    public void pagarMulta(int index){
        Multa multa = this.emprestimos.get(index).getMulta();
        if (this.verificarMulta(index) && saldo >= multa.getValorMulta()){
            saldo -= multa.getValorMulta();                                         
            emprestimos.remove(index);                                           
        }
    }
    
    
    /**
     * Devolve o livro e encerra o empr�stimo.
     * A devolu��o s� ser� poss�vel se n�o houver multa ativa.
     * @param index 
     */
    public void devolverLivro(int index){
        if (this.verificarMulta(index) == false)           
            emprestimos.remove(index);                                         
    }
    
    /**
     * Calcula a idade do cliente � partir da data de nascimento cadastrada.
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
