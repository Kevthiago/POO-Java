public class Carro extends Veiculo{
    //atributos
    private int numeroPortas;

    //construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    //métodos
    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
    @Override
    public String toString(){
        return super.toString() + "\nNúmero de portas: " + getNumeroPortas();
    }
}
