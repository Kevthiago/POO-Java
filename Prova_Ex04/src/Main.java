public class Main {
    public static void main(String[] args) {
        //Instanciando Objetos
        Animal primeiro = new Mamifero("Kevin", "21", "Olá! Sou um humano falante!");
        Animal segundo = new Ave("Canarinho", "8 meses", "Piii Piii!");
        Animal terceiro = new Peixe("Nemo", "3 semanas", "Glub Glub!");

        System.out.println(primeiro.emitirSom());
        System.out.println();
        System.out.println(segundo.emitirSom());
        System.out.println();
        System.out.println(terceiro.emitirSom());
        System.out.println();
    }
}
