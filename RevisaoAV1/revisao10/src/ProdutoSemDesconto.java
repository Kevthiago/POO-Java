public class ProdutoSemDesconto extends ProdutoBase{
    //Construtor
    public ProdutoSemDesconto(String nome, double preco) {
        super(nome, preco);
    }

    //Métodos
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes();
    }


    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal();
    }
}
