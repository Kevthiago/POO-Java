public class TesteCachorro {
    public static void main (String[] arg){
        //Atribuição de objetos
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Cachorro c3 = new Cachorro();

        //Testes
        c1.Raca = "Pinscher";
        c1.tamanho = 15;
        c1.cor = "Caramelo";
        c1.tem_rabo = false;

        c2.Raca = "Doberman";
        c2.tamanho = 120;
        c2.cor = "Preto";
        c2.tem_rabo = true;

        c3.Raca = "Pastor Alemão";
        c3.tamanho = 98;
        c3.cor = "Marrom";
        c3.tem_rabo = true;

        System.out.println("Cachorro 01:");
        c1.late();
        System.out.println("\nCachorro 02:");
        c2.late();
        System.out.println("\nCachorro 02:");
        c3.late();
    }
}
