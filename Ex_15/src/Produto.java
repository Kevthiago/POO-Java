public class Produto {
    // Atributos
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método para calcular a média dos preços
    public static double calcularMediaPrecos(Produto[] produtos) {
        double soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }
        return soma / produtos.length;
    }

    public static void main(String[] args) {
        // Criação do vetor de objetos Produto
        Produto[] produtos = new Produto[10];

        // Inicialização dos objetos Produto
        produtos[0] = new Produto("Produto 1", 10.0);
        produtos[1] = new Produto("Produto 2", 15.5);
        produtos[2] = new Produto("Produto 3", 20.0);
        produtos[3] = new Produto("Produto 4", 25.0);
        produtos[4] = new Produto("Produto 5", 30.0);
        produtos[5] = new Produto("Produto 6", 35.5);
        produtos[6] = new Produto("Produto 7", 40.0);
        produtos[7] = new Produto("Produto 8", 45.5);
        produtos[8] = new Produto("Produto 9", 50.0);
        produtos[9] = new Produto("Produto 10", 55.0);

        // Calcula e imprime a média dos preços dos produtos
        double mediaPrecos = Produto.calcularMediaPrecos(produtos);
        System.out.println("A média dos preços dos produtos é: " + mediaPrecos);
    }
}
