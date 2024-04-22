abstract class ProdutoBase implements Produto {
    //Atributos
    String nome;
    double preco;

    //Construtor
    public ProdutoBase(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos
    public String exibirDetalhes(){
        return "Nome: " + nome + "\nPreço: " + calcularPrecoFinal();
    }

    public double calcularPrecoFinal(){
        return preco;
    }
}
