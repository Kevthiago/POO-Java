public class Caminhao extends Veiculo{
    public Caminhao(String modelo, String marca, int anoFabricacao, boolean disponivel) {
        super(modelo, marca, anoFabricacao, disponivel);
    }
    //Métodos
    @Override
    public boolean alugar() {
        return super.alugar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }
}
