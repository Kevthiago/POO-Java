public class Main {
    public static void main(String[] args) {
        //instanciando objetos
        Veiculo v1 = new Carro("Corolla", "Toytota", 2020, true);

        //Teste
        System.out.println(v1.alugar());
        System.out.println(v1.devolver());
    }
}
