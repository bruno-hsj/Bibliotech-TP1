package projeto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * A classe Emprestimo é responsável pela criação de um empréstimo de uma obra feita por um usuário, armazenando os dados do empréstimo e a que cliente se refere.
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
     * Cria um objeto Empréstimo sem nenhum atributo.
     */
    public Emprestimo() {
    }
    
    
    /**
     * Cria um objeto Empréstimo, passando objetos Obra e Cliente como parâmetros.
     * @param obra A qual obra o empréstimo é feito.
     * @param cliente O cliente que pediu o empréstimo.
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
     * Retorna a data limite do empréstimo, esta data pode ser adiada por meio de renovações.
     * @return Retorna a data final do empréstimo.
     */
    public Calendar getDataFinal() {
        return dataFinal;
        
    }
    /**
     * Retorna a quantidade máxima de renovações do empréstimo. A quantidade de renovações pode mudar dependendo se esse serviço já foi utilizado.
     * @return Retorna quantas renovações ainda são possíveis.
     */
    public int getQntdRenovacoes() {
        return qntdRenovacoes;
    }
    
    
    /**
     * Retorna a data em que o empréstimo tem início. A data pode ser escolhida pelo cliente.
     * @return Retorna a data inicial do empréstimo.
     */
    public Calendar getDataInicial() {
        return dataInicial;
    }
    
    
    /**
     * Retorna a obra referente à esse empréstimo. A obra sempre será um objeto filho de Obra, visto que esta é uma classe abstrata.
     * @return Retorna o objeto Obra relacionado ao empréstimo.
     */
    public Obra getObra() {
        return obra;
    }
    
    
    /**
     * Retorna qual cliente é responsável por este empréstimo. O cliente pode estar relacionado a mais de um empréstimo.
     * @return Retorna qual cliente fez o empréstimo.
     */
    public Cliente getCliente() {
        return cliente;
    }
    
    
    /**
     * Retorna um objeto Multa associado ao empréstimo. A multa pode ou não estar ativa.
     * @return Retorna um objeto Multa do empréstimo.
     */
    public Multa getMulta() {
        return multa;
    }
    
    
    /**
     * O método recebe um parâmetro do tipo Multa e utiliza-o para inicializar o atribulto multa.
     * @param multa Um objeto do tipo Multa.
     */
    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    
    
    
    /**
     * O metódo é responsável por definir a data inicial do empréstimo, e assim inicializar o atributo. 
     * Também inicializa a data final do empréstimo, que sempre será 1 mês a mais que a data inicial.
     * @param dia O dia de início do empréstimo.
     * @param mes O mês de início do empréstimo.
     * @param ano O ano de início do empréstimo.
     */
    public void setDataInicial(int dia, int mes, int ano) {
        dataInicial.set(ano, mes-1, dia);
        dataFinal.set(ano, mes-1, dia);
        dataFinal.add(Calendar.MONTH, 1);   
    }
    
    /**
     * O método é responsável por calcular a diferença entre a data final e a data inicial, sendo essa diferença o prazo restante do empréstimo.
     * A diferença é retornada como inteiro, representando os dias faltantes.
     * @return Retorna quantos dias faltam para o limite do empréstimo.
     */
    public int tempoRestante(){
        long aux = dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis(); // pega o tempo da data inicial e final em milissegundos e subtrai
        int diferenca = (int) (aux / (1000 * 60 * 60 * 24));                    // transforma a diferença de tempo em dias
        return diferenca;                                                       // retorna quantos dias faltam para a data limite
    }
    
    
    /**
     * O método é responsável pela extensão do prazo final do empréstimo. 
     * A extensão sempre será de um mês, e gastará uma das renovações possíveis.
     */
    public void extendePrazo(){
        dataFinal.add(Calendar.MONTH, 1);                            // aumenta 1 mes da data final
        qntdRenovacoes -= 1;                                                    // diminui a quantidade de renovações possíveis
    }
}
