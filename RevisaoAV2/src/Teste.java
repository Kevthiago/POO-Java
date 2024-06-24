public class Teste {
    public static void main(String[] args) {
        //Cadastro de produtos
        Material livro1 = new Livro(001, "Livro 1", true, "Autor 1");
        Material livro2 = new Livro(002, "Livro 2", true, "Autor 2");

        Material dvd1 = new DVD(003, "DVD 1", true, 120);
        Material dvd2 = new DVD(004, "DVD 2", false, 120);

        Material revista1 = new Revista(005, "Revista 1", false, 230);
        Material revista2 = new Revista(006, "Revista 2", true, 300);

        //Cadastro de usuários
        Usuario user1 = new Usuario(0101, "Usuário 1", 0);
        Usuario user2 = new Usuario(0202, "Usuário 2", 1);

        //Testes
        System.out.println("------------------------------------");
        System.out.println("Lista de Materiais:\n");
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(dvd1.toString());
        System.out.println(dvd2.toString());
        System.out.println(revista1.toString());
        System.out.println(revista2.toString());
        System.out.println("------------------------------------");
        System.out.println("Total de materiais cadastrados: " + Material.contarMateriais());
        System.out.println("------------------------------------");

        user1.emprestimo(livro1);
        user2.emprestimo(dvd2);

        System.out.println("------------------------------------");
        System.out.println("Lista de Materiais:\n");
        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(dvd1.toString());
        System.out.println(dvd2.toString());
        System.out.println(revista1.toString());
        System.out.println(revista2.toString());
        System.out.println("------------------------------------");
    }
}
