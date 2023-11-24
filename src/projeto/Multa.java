package projeto;

public class Multa {
    // Atributos
    private double valorMulta;
    private boolean statusMulta;
    private int diasExcedidos;
    private Emprestimo emprestimo;
    private double extra;
    
    // Construtores
    public Multa(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            valorMulta = 0;                                 // valor da multa = 0 
            diasExcedidos = 0;                              // não passou nenhum dia da data limite
            statusMulta = false;                            // não tem multa
        }
        else{                                               // se tiver passado do prazo
            diasExcedidos = Math.abs(diasExcedidos);      // passa diasExcedidos de negativo para positvo 
            valorMulta = (0.5 * diasExcedidos) + extra;     // valor da multa = taxa * quantos dias passaram * valor extra
            statusMulta = true;                             // existe multa
        }
    }
    
    // Getters e Setters
    public double getValorMulta() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // não passou nenhum dia da data limite
            valorMulta = 0 + extra;                         // valor da multa = 0 
        }
        else                                                // se tiver passado do prazo
            diasExcedidos = diasExcedidos * -1;             // passa diasExcedidos de negativo para positvo
            valorMulta = (0.5 * diasExcedidos) + extra;     // valor da multa = taxa * quantos dias passaram * valor extra
            statusMulta = true;
        return valorMulta;                                  // retorna o valor da multa atualizado em relação ao prazo
    }
    public boolean getStatusMulta() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // não passou nenhum dia da data limite
            return false;                                   // não tem multa
        }
        diasExcedidos = -1 * diasExcedidos;                 // passa diasExcedidos de negativo para positvo
        statusMulta = true;                                 // tem multa
        return true;
    }
    public int getDiasExcedidos() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0)                             // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // não passou nenhum dia da data limit
        diasExcedidos = Math.abs(diasExcedidos);          // passa diasExcedidos de negativo para positvo
        return diasExcedidos;
    }
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    // Métodos
    public void aumentaMulta(double valor){
        extra += valor;                                     // adiciona um valor extra à multa (pq o valor original da multa está atualizando automaticamente)
    }
}
