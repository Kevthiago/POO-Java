public class Carro extends Veiculo{
    public Carro(String modelo, String marca, int anoFabricacao, boolean disponivel) {
        super(modelo, marca, anoFabricacao, disponivel);
    }

    //Métodos
    @Override
    public boolean alugar() {
        super.alugar();
        return false;
    }

    @Override
    public void devolver() {
        super.devolver();
    }
}
