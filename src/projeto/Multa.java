package projeto;

/**
 * Uma classe que é responsável por tratar da multa de um empréstimo bibliotecário.
 * @author netol
 */
public class Multa {
    private double valorMulta;
    private boolean statusMulta;
    private int diasExcedidos;
    private Emprestimo emprestimo;
    private double extra;
    
    /**
     * Cria um objeto Multa com nenhum atributo inicializado.
     */
    public Multa() {
    }

    /**
     * Cria um objeto Multa com a referência ao empréstimo inicializado.
     * Todos os atributos são atualizados automaticamente de acordo com os dados do empréstimo.
     * @param emprestimo Um objeto empréstimo o qual deseja-se analisar a multa.
     */
    public Multa(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        diasExcedidos = emprestimo.tempoRestante();       
        if (diasExcedidos >= 0){                            
            valorMulta = 0;                             
            diasExcedidos = 0;                            
            statusMulta = false;                            
        }
        else{                                               
            diasExcedidos = Math.abs(diasExcedidos);   
            valorMulta = (0.5 * diasExcedidos) + extra;    
            statusMulta = true;    
        }
    }
    
    
    /**
     * Obtém o valor da multa do empréstimo.
     * Os dados são obtidos à partir das datas limites do empréstimo.
     * Todos os atributos são atualizados automaticamente cada vez que o método é chamado.
     * O valor da multa sempre será o cálculo padrão adicionado à um valor extra, se desejado.
     * @return Retorna o valor da multa.
     */
    public double getValorMulta() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // não passou nenhum dia da data limite
            valorMulta = 0 + extra;                         // valor da multa = 0 
            statusMulta = false;
        }
        else{                                                // se tiver passado do prazo
            diasExcedidos = diasExcedidos * -1;             // passa diasExcedidos de negativo para positvo
            valorMulta = (0.5 * diasExcedidos) + extra;     // valor da multa = taxa * quantos dias passaram * valor extra
            statusMulta = true;
        }
        return valorMulta;                                  // retorna o valor da multa atualizado em relação ao prazo
    }
    
    
    /**
     * Obtém o status da multa do empréstimo.
     * Os dados são obtidos à partir das datas limites do empréstimo.
     * Todos os atributos são atualizados automaticamente cada vez que o método é chamado.
     * @return Retorna true se houver multa ativa e false caso contrário.
     */
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
    
    
    /**
     * Obtém a quantidade de dias excedidos em relação à data de expiração do empréstimo.
     * O valor é atualizado automáticamente a cada chamada deste método.
     * Os dias excedidos sempre serão zero se ainda houver prazo à cumprir.
     * @return Retorna a quantidade de dias excedidos do final do empréstimo.
     */
    public int getDiasExcedidos() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0)                             // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // não passou nenhum dia da data limit
        diasExcedidos = Math.abs(diasExcedidos);          // passa diasExcedidos de negativo para positvo
        return diasExcedidos;
    }
    
    
    /**
     * Obtém o empréstimo o qual essa multa se refere.
     * @return Retorna o objeto Empréstimo associado a esta multa.
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    /**
     * Aumenta o valor da multa numa quantidade fixa passada.
     * O aumento é feito por meio de um extra e sempre estará adicionada ao valor da multa.
     * @param valor O valor à ser adicionado. 
     */
    public void aumentaMulta(double valor){
        extra += valor;                                     // adiciona um valor extra à multa (pq o valor original da multa está atualizando automaticamente)
    }
}
