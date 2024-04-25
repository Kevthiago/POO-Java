public class TV extends ProdutoEletronico{
    //Atributos
    double tamanhoTela;

    //Construtor
    public TV(String modelo, String marca, double preco, double tamanhoTela) {
        super(modelo, marca, preco);
        this.tamanhoTela = tamanhoTela;
    }
}
