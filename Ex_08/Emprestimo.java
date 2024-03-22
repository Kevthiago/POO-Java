public class Emprestimo {
    protected double taxa;
    protected int diasAtraso;

    // Construtor
    public Emprestimo(double taxa, int diasAtraso){
        this.taxa = taxa;
        this.diasAtraso = diasAtraso;
    }
    //Métodos

    public double getTaxa() {
        return taxa;
    }
    public int getDiasAtraso() {
        return diasAtraso;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    // Método para calcular a multa
    public double calcularMulta(int diasAtrasoS){
        return taxa * getDiasAtraso();
    }
}