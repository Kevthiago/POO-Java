public class Moto extends Veiculo{
    //atributos
    private boolean eletrica;

    //contrutor
    public Moto(String marca, String modelo, int ano, boolean eletrica) {
        super(marca, modelo, ano);
        this.eletrica = eletrica;
    }

    //métodos
    @Override
    public String toString(){
        return super.toString() + "\nElétrica: " + eletrica;
    }
}
