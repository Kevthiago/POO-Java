class Produto {
    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Método estático para calcular o valor total em estoque de um array de produtos
    public static double calcularValorTotalEmEstoque(Produto[] produtos) {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco() * produto.getQuantidadeEmEstoque();
        }
        return valorTotal;
    }

    // Método estático para encontrar o produto mais caro
    public static Produto encontrarProdutoMaisCaro(Produto[] produtos) {
        if (produtos.length == 0) {
            return null; // Retorna null se o array estiver vazio
        }

        Produto produtoMaisCaro = produtos[0];
        for (Produto produto : produtos) {
            if (produto.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        // Criação de um array de produtos
        Produto[] produtos = new Produto[5];

        // Inicialização dos objetos Produto
        produtos[0] = new Produto("Produto A", 10.0, 50);
        produtos[1] = new Produto("Produto B", 15.5, 30);
        produtos[2] = new Produto("Produto C", 8.0, 80);
        produtos[3] = new Produto("Produto D", 12.0, 40);
        produtos[4] = new Produto("Produto E", 20.0, 20);

        // Cálculo e impressão do valor total em estoque
        double valorTotal = Produto.calcularValorTotalEmEstoque(produtos);
        System.out.println("O valor total em estoque é: " + valorTotal);

        // Encontrar e imprimir o produto mais caro
        Produto produtoMaisCaro = Produto.encontrarProdutoMaisCaro(produtos);
        if (produtoMaisCaro != null) {
            System.out.println("O produto mais caro é: " + produtoMaisCaro.getNome() + " com preço de " + produtoMaisCaro.getPreco());
        } else {
            System.out.println("O array de produtos está vazio.");
        }
    }
}
