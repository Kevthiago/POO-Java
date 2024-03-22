public class CurtoPrazo extends Emprestimo {

    // Construtor
    public CurtoPrazo(double taxa, int diasAtraso){
        super(taxa, diasAtraso); // Multa por dia de atraso para Curto Prazo
    }
}