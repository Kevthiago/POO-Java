import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Instanciando objetos - MATERIAIS
        Material material1 = new Revista("Playboy", 001,"Playboy", true);
        Material material2 = new Revista("Lista de Bilionários", 002, "Forbes", true);

        Material material3 = new Livro("Apologia de Sócrates", 003, true, "Platão");
        Material material4 = new Livro("O banquete", 004, true, "Platão");

        Material material5 = new DVD("Interestelar", 005, 3, true);
        Material material6 = new DVD("Oppenheimer", 006, 3, true);

        //Instanciando objetos - USUÁRIOS
        Usuario user1 = new Usuario("Kevin", 0, 12120421);
        Usuario user2 = new Usuario("Poly", 0, 40028922);
        Usuario user3 = new Usuario("Gabi", 0, 12121010);

        List<Material> materiais = new ArrayList<>();
        materiais.add(material1);
        materiais.add(material2);
        materiais.add(material3);
        materiais.add(material4);
        materiais.add(material5);
        materiais.add(material6);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        System.out.println("-------------------------------------------------");
        System.out.println("Usuários cadastrados:");
        System.out.println("-------------------------------------------------");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\n-------------------------------------------------");
        System.out.println("Materiais disponíveis antes dos empréstimos:");
        System.out.println("-------------------------------------------------");
        Material.listarMateriais(materiais);

        System.out.println("\nRealizando empréstimos...");
        Material.realizarEmprestimo(user1, material1);
        Material.realizarEmprestimo(user2, material3);
        Material.realizarEmprestimo(user3, material6);

        System.out.println("\n-------------------------------------------------");
        System.out.println("Materiais disponíveis após os empréstimos:");
        System.out.println("-------------------------------------------------");
        Material.listarMateriais(materiais);

        System.out.println("\nUsuários após os empréstimos:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\nDevolvendo materiais...");
        Material.devolverEmprestimo(user2, material3);

        System.out.println("\n-------------------------------------------------");
        System.out.println("Materiais disponíveis após a devolução:");
        System.out.println("-------------------------------------------------");
        Material.listarMateriais(materiais);

        System.out.println("\nUsuários após a devolução:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("\n-------------------------------------------------");
        System.out.println("O número total de materiais é: " + Material.contarMateriais());
        System.out.println("-------------------------------------------------");
    }
}
