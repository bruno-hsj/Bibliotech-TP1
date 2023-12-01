package projeto;

/**
 * Uma classe que � respons�vel por tratar da multa de um empr�stimo bibliotec�rio.
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
     * Cria um objeto Multa com a refer�ncia ao empr�stimo inicializado.
     * Todos os atributos s�o atualizados automaticamente de acordo com os dados do empr�stimo.
     * @param emprestimo Um objeto empr�stimo o qual deseja-se analisar a multa.
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
     * Obt�m o valor da multa do empr�stimo.
     * Os dados s�o obtidos � partir das datas limites do empr�stimo.
     * Todos os atributos s�o atualizados automaticamente cada vez que o m�todo � chamado.
     * O valor da multa sempre ser� o c�lculo padr�o adicionado � um valor extra, se desejado.
     * @return Retorna o valor da multa.
     */
    public double getValorMulta() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // n�o passou nenhum dia da data limite
            valorMulta = 0 + extra;                         // valor da multa = 0 
            statusMulta = false;
        }
        else{                                                // se tiver passado do prazo
            diasExcedidos = diasExcedidos * -1;             // passa diasExcedidos de negativo para positvo
            valorMulta = (0.5 * diasExcedidos) + extra;     // valor da multa = taxa * quantos dias passaram * valor extra
            statusMulta = true;
        }
        return valorMulta;                                  // retorna o valor da multa atualizado em rela��o ao prazo
    }
    
    
    /**
     * Obt�m o status da multa do empr�stimo.
     * Os dados s�o obtidos � partir das datas limites do empr�stimo.
     * Todos os atributos s�o atualizados automaticamente cada vez que o m�todo � chamado.
     * @return Retorna true se houver multa ativa e false caso contr�rio.
     */
    public boolean getStatusMulta() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0){                            // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // n�o passou nenhum dia da data limite
            return false;                                   // n�o tem multa
        }
        diasExcedidos = -1 * diasExcedidos;                 // passa diasExcedidos de negativo para positvo
        statusMulta = true;                                 // tem multa
        return true;
    }
    
    
    /**
     * Obt�m a quantidade de dias excedidos em rela��o � data de expira��o do empr�stimo.
     * O valor � atualizado autom�ticamente a cada chamada deste m�todo.
     * Os dias excedidos sempre ser�o zero se ainda houver prazo � cumprir.
     * @return Retorna a quantidade de dias excedidos do final do empr�stimo.
     */
    public int getDiasExcedidos() {
        diasExcedidos = emprestimo.tempoRestante();         // diasExcedidos = dias restantes
        if (diasExcedidos >= 0)                             // se ainda houver dias faltando pro final do emprestimo
            diasExcedidos = 0;                              // n�o passou nenhum dia da data limit
        diasExcedidos = Math.abs(diasExcedidos);          // passa diasExcedidos de negativo para positvo
        return diasExcedidos;
    }
    
    
    /**
     * Obt�m o empr�stimo o qual essa multa se refere.
     * @return Retorna o objeto Empr�stimo associado a esta multa.
     */
    public Emprestimo getEmprestimo() {
        return emprestimo;
    }
    
    /**
     * Aumenta o valor da multa numa quantidade fixa passada.
     * O aumento � feito por meio de um extra e sempre estar� adicionada ao valor da multa.
     * @param valor O valor � ser adicionado. 
     */
    public void aumentaMulta(double valor){
        extra += valor;                                     // adiciona um valor extra � multa (pq o valor original da multa est� atualizando automaticamente)
    }
}
