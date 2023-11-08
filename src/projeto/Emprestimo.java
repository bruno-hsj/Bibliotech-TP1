package projeto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Emprestimo {
    // Atributos
    private Calendar dataInicial = new GregorianCalendar();
    private Calendar dataFinal = new GregorianCalendar();
    private int qntdRenovacoes;
    private Obra obra;
    private Cliente cliente;
    private Multa multa;
    
    // Construtor
    public Emprestimo() {
    }
    public Emprestimo(Obra obra, Cliente cliente) {
        this.obra = obra;
        this.cliente = cliente;
        if (obra.getQntdPaginas() < 500)
            qntdRenovacoes = 1;
        else
            qntdRenovacoes = 2;
    }
    
    // Getters e Setters
    public Calendar getDataFinal() {
        return dataFinal;
    }
    public int getQntdRenovacoes() {
        return qntdRenovacoes;
    }
    public Calendar getDataInicial() {
        return dataInicial;
    }
    public Obra getObra() {
        return obra;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Multa getMulta() {
        return multa;
    }
    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    public void setDataInicial(int dia, int mes, int ano) {
        dataInicial.set(ano, mes-1, dia);
        dataFinal.set(ano, mes-1, dia);
        dataFinal.add(Calendar.MONTH, 1);   
    }
    
    // Métodos
    public int tempoRestante(){
        long aux = dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis(); // pega o tempo da data inicial e final em milissegundos e subtrai
        int diferenca = (int) (aux / (1000 * 60 * 60 * 24));                    // transforma a diferença de tempo em dias
        return diferenca;                                                       // retorna quantos dias faltam para a data limite
    }
    public void extendePrazo(){
        dataFinal.add(Calendar.MONTH, 1);                            // aumenta 1 mes da data final
        qntdRenovacoes -= 1;                                                    // diminui a quantidade de renovações possíveis
    }
}
