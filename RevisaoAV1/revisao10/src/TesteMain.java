public class TesteMain {
    public static void main(String[] args) {
        //Instanciando objetos
        ProdutoBase produto1 = new ProdutoComDesconto("Botina", 165.00, 20);
        ProdutoBase getProduto1 = new ProdutoSemDesconto("Botina", 165.00);

        //Testes
        System.out.println(produto1.exibirDetalhes());
        System.out.println(getProduto1.exibirDetalhes());
    }

}
