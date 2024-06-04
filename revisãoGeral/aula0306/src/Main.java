public class Main {
    public static void main(String[] args) {
        //Instanciando objetos - MATERIAIS
        Material material1 = new Revista("Playboy", 001,"Playboy", true);
        Material material2 = new Revista("Lista de Bilionários", 002, "Forbes", true);

        Material material3 = new Livro("Apologia de Sócrates", 003, "Platão", true);
        Material material4 = new Livro("O banquete", 004, "Platão", true);

        Material material5 = new DVD("Interestelar", 005, 3, true);
        Material material6 = new DVD("Oppenheimer", 006, 3, true);

        //Instanciando objetos - USUÁRIOS
        Usuario user1 = new Usuario("Kevin", 5, 12120421);
        Usuario user2 = new Usuario("Poly", 4, 40028922);
        Usuario user3 = new Usuario("Gabi", 0, 12121010);

        //Método para ver disponibilidade


        //Testes dos métodos

    }
}
