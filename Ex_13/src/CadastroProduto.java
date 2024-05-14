import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < produtos.length; i++){
            System.out.println("Digite o nome do produto: ");
            String nome = scn.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = Integer.parseInt(scn.nextLine());

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = Integer.parseInt(scn.nextLine());

            produtos[i] = new Produto(nome, preco, quantidade);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Lista de produtos cadastrados com preço e estoque");
        System.out.println("-------------------------------------------------------------");

        double maxValorTotal = 0;
        int somaValores = 0;

        for (Produto produto : produtos) {
            double valorTotal = produto.valorTotal();
            if (valorTotal > maxValorTotal){
                maxValorTotal = valorTotal;
            }

            if (produto != null){
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Valor total do estoque: " + valorTotal);
                System.out.println("-----------------------------------");

                somaValores += valorTotal;
            }
        }
        System.out.println("Maior valor de estoque: " + maxValorTotal);
        System.out.println("Média de valores do estoque: " + somaValores / produtos.length);
    }

}
