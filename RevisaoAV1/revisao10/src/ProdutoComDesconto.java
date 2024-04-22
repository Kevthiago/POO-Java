public class ProdutoComDesconto extends ProdutoBase{
    //Atributos
    double desconto;

    //Construtor
    public ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    //Métodos
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes();
    }

    @Override
    public double calcularPrecoFinal() {
        return ((super.calcularPrecoFinal() - desconto));
    }
}
