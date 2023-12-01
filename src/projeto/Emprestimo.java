package projeto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A classe Emprestimo � respons�vel pela cria��o de um empr�stimo de uma obra feita por um usu�rio, armazenando os dados do empr�stimo e a que cliente se refere.
 * @author netol
 */
public class Emprestimo {
    private Calendar dataInicial = new GregorianCalendar();
    private Calendar dataFinal = new GregorianCalendar();
    private int qntdRenovacoes;
    private Obra obra;
    private Cliente cliente;
    private Multa multa;
    
    
    /**
     * Cria um objeto Empr�stimo sem nenhum atributo.
     */
    public Emprestimo() {
    }
    
    
    /**
     * Cria um objeto Empr�stimo, passando objetos Obra e Cliente como par�metros.
     * @param obra A qual obra o empr�stimo � feito.
     * @param cliente O cliente que pediu o empr�stimo.
     */
    public Emprestimo(Obra obra, Cliente cliente) {
        this.obra = obra;
        this.cliente = cliente;
        if (obra.getQntdPaginas() < 500)
            qntdRenovacoes = 1;
        else
            qntdRenovacoes = 2;
    }
    
    /**
     * Retorna a data limite do empr�stimo, esta data pode ser adiada por meio de renova��es.
     * @return Retorna a data final do empr�stimo.
     */
    public Calendar getDataFinal() {
        return dataFinal;
        
    }
    /**
     * Retorna a quantidade m�xima de renova��es do empr�stimo. A quantidade de renova��es pode mudar dependendo se esse servi�o j� foi utilizado.
     * @return Retorna quantas renova��es ainda s�o poss�veis.
     */
    public int getQntdRenovacoes() {
        return qntdRenovacoes;
    }
    
    
    /**
     * Retorna a data em que o empr�stimo tem in�cio. A data pode ser escolhida pelo cliente.
     * @return Retorna a data inicial do empr�stimo.
     */
    public Calendar getDataInicial() {
        return dataInicial;
    }
    
    
    /**
     * Retorna a obra referente � esse empr�stimo. A obra sempre ser� um objeto filho de Obra, visto que esta � uma classe abstrata.
     * @return Retorna o objeto Obra relacionado ao empr�stimo.
     */
    public Obra getObra() {
        return obra;
    }
    
    
    /**
     * Retorna qual cliente � respons�vel por este empr�stimo. O cliente pode estar relacionado a mais de um empr�stimo.
     * @return Retorna qual cliente fez o empr�stimo.
     */
    public Cliente getCliente() {
        return cliente;
    }
    
    
    /**
     * Retorna um objeto Multa associado ao empr�stimo. A multa pode ou n�o estar ativa.
     * @return Retorna um objeto Multa do empr�stimo.
     */
    public Multa getMulta() {
        return multa;
    }
    
    
    /**
     * O m�todo recebe um par�metro do tipo Multa e utiliza-o para inicializar o atribulto multa.
     * @param multa Um objeto do tipo Multa.
     */
    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    
    
    
    /**
     * O met�do � respons�vel por definir a data inicial do empr�stimo, e assim inicializar o atributo. 
     * Tamb�m inicializa a data final do empr�stimo, que sempre ser� 1 m�s a mais que a data inicial.
     * @param dia O dia de in�cio do empr�stimo.
     * @param mes O m�s de in�cio do empr�stimo.
     * @param ano O ano de in�cio do empr�stimo.
     */
    public void setDataInicial(int dia, int mes, int ano) {
        dataInicial.set(ano, mes-1, dia);
        dataFinal.set(ano, mes-1, dia);
        dataFinal.add(Calendar.MONTH, 1);   
    }
    
    /**
     * O m�todo � respons�vel por calcular a diferen�a entre a data final e a data inicial, sendo essa diferen�a o prazo restante do empr�stimo.
     * A diferen�a � retornada como inteiro, representando os dias faltantes.
     * @return Retorna quantos dias faltam para o limite do empr�stimo.
     */
    public int tempoRestante(){
        long aux = dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis(); // pega o tempo da data inicial e final em milissegundos e subtrai
        int diferenca = (int) (aux / (1000 * 60 * 60 * 24));                    // transforma a diferen�a de tempo em dias
        return diferenca;                                                       // retorna quantos dias faltam para a data limite
    }
    
    
    /**
     * O m�todo � respons�vel pela extens�o do prazo final do empr�stimo. 
     * A extens�o sempre ser� de um m�s, e gastar� uma das renova��es poss�veis.
     */
    public void extendePrazo(){
        dataFinal.add(Calendar.MONTH, 1);                            // aumenta 1 mes da data final
        qntdRenovacoes -= 1;                                                    // diminui a quantidade de renova��es poss�veis
    }
}
