public class Laptop extends ProdutoEletronico{
    //Atributos
    int memoriaRAM;

    //Construtor
    public Laptop(String modelo, String marca, double preco, int memoriaRAM) {
        super(modelo, marca, preco);
        this.memoriaRAM = memoriaRAM;
    }
}
