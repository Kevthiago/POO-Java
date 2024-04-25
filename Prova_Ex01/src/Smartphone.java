public class Smartphone extends ProdutoEletronico{
    //Atributos
    String sistemaOperacional;

    //Construtor
    public Smartphone(String modelo, String marca, double preco, String sistemaOperacional) {
        super(modelo, marca, preco);
        this.sistemaOperacional = sistemaOperacional;
    }
}
