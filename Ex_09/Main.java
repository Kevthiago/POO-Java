public class Main {
    public static void main(String[] args) {

        //estanciando objetos
        Veiculo v1 = new Carro("Toyota", "Corolla", 2024, 4);
        Veiculo v2 = new Moto("Honda", "CB Twister 250f", 2019, false);

        //testando métodos
        System.out.println("Veículo 1:\n" + v1.toString());
        System.out.println("\nVeículo 2:\n" + v2.toString());
    }
}
