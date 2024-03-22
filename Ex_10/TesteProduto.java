public class TesteProduto {
    public static void main(String[] args) {
        //instanciando objetos
        Produto p1 = new Produto("Galaxy S23", 3200, 5);
        Produto p2 = new Produto("Acer Aspire 3", 3500, 2);
        Produto p3 = new Produto("Smart TV 60°", 5000, 0 );

        System.out.println("-----Tabela de produtos:-----");
        System.out.println("Produto 1:\n" + p1.detalhes());
        System.out.println("Produto 2:\n" + p2.detalhes());
        System.out.println("Produto 3:\n" + p3.detalhes());
        System.out.println("-----------------------------");

        //teste métodos
        System.out.println("Atualizações teste:");
        p1.adicionarEstoque(5);
        System.out.println("Produto 1:\n" + p1.detalhes());
        p2.removerEstoque(1);
        System.out.println("Produto 2:\n" + p2.detalhes());
        p3.removerEstoque(3);
        System.out.println("Produto 3:\n" + p3.detalhes());
    }
}
