import java.util.Scanner;

class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    // Construtor
    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    // Método estático para emprestar um livro
    public static boolean emprestarLivro(Livro[] livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getQuantidadeDisponivel() > 0) {
                livro.quantidadeDisponivel--;
                return true; // Empréstimo bem-sucedido
            }
        }
        return false; // Livro não disponível para empréstimo
    }

    // Método estático para verificar a disponibilidade de um livro específico
    public static boolean verificarDisponibilidade(Livro[] livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro.getQuantidadeDisponivel() > 0;
            }
        }
        return false; // Livro não encontrado ou não disponível
    }

    public static void main(String[] args) {
        // Criação de um array de livros
        Livro[] livros = new Livro[5];

        // Inicialização dos objetos Livro
        livros[0] = new Livro("O Príncipe", "Maquiavel", 3);
        livros[1] = new Livro("Guerra e Paz", "Tolstói", 2);
        livros[2] = new Livro("Uma Breve História do Tempo", "Stephen Hawking", 0);
        livros[3] = new Livro("O Hobbit", "J.R.R. Tolkien", 1);
        livros[4] = new Livro("Dom Quixote", "Cervantes", 4);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Emprestar um livro");
            System.out.println("2. Verificar a disponibilidade de um livro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Livros disponíveis para empréstimo:");
                    for (Livro livro : livros) {
                        if (livro.getQuantidadeDisponivel() > 0) {
                            System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor());
                        }
                    }
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    String tituloParaEmprestimo = scanner.nextLine();
                    if (Livro.emprestarLivro(livros, tituloParaEmprestimo)) {
                        System.out.println("Empréstimo do livro '" + tituloParaEmprestimo + "' realizado com sucesso.");
                    } else {
                        System.out.println("O livro '" + tituloParaEmprestimo + "' não está disponível para empréstimo.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser verificado: ");
                    String tituloParaVerificar = scanner.nextLine();
                    if (Livro.verificarDisponibilidade(livros, tituloParaVerificar)) {
                        System.out.println("O livro '" + tituloParaVerificar + "' está disponível.");
                    } else {
                        System.out.println("O livro '" + tituloParaVerificar + "' não está disponível.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
