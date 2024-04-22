public class Produtos {
   //Atributos
    String nome;
    double preco;
    int quantidade;

    //Construtor
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Métodos
    public int aumentar(int x){
        return quantidade = quantidade + x;
    }

    public int diminuir(int x){
        return quantidade = quantidade - x;
    }

    public String valorTotal(){
        return "Valor total do estoque: " + (preco * quantidade) ;
    }

    public static void main(String[] args) {
        //Instanciando objetos
        Produtos p1 = new Produtos("Ração Quatree", 180.00, 5);

        //Testes
        System.out.println(p1.valorTotal());
        p1.aumentar(2);
        System.out.println(p1.valorTotal());
        p1.diminuir(6);
        System.out.println(p1.valorTotal());
    }
}
