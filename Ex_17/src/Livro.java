import java.util.Scanner;

class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;  // Inicialmente, o livro está disponível
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Biblioteca {
    // Atributo
    private Livro[] livros;
    private int contador;

    // Construtor
    public Biblioteca(int tamanho) {
        livros = new Livro[tamanho];
        contador = 0;
    }

    // Método para adicionar um novo livro
    public void adicionarLivro(String titulo, String autor) {
        if (contador < livros.length) {
            livros[contador] = new Livro(titulo, autor);
            contador++;
            System.out.println("Livro adicionado com sucesso!");
        } else {
            System.out.println("A biblioteca está cheia, não é possível adicionar mais livros.");
        }
    }

    // Método para emprestar um livro
    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo) && livros[i].isDisponivel()) {
                livros[i].setDisponivel(false);
                System.out.println("Livro emprestado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo.");
    }

    // Método para devolver um livro
    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo) && !livros[i].isDisponivel()) {
                livros[i].setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado ou já está disponível.");
    }

    // Método para listar todos os livros
    public void listarTodosLivros() {
        System.out.println("Lista de todos os livros:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Título: " + livros[i].getTitulo() + ", Autor: " + livros[i].getAutor() +
                    ", Disponível: " + (livros[i].isDisponivel() ? "Sim" : "Não"));
        }
    }

    // Método para listar apenas os livros disponíveis
    public void listarLivrosDisponiveis() {
        System.out.println("Lista de livros disponíveis:");
        for (int i = 0; i < contador; i++) {
            if (livros[i].isDisponivel()) {
                System.out.println("Título: " + livros[i].getTitulo() + ", Autor: " + livros[i].getAutor());
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Emprestar um livro");
            System.out.println("3. Devolver um livro");
            System.out.println("4. Listar todos os livros");
            System.out.println("5. Listar apenas os livros disponíveis");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    biblioteca.adicionarLivro(titulo, autor);
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    titulo = scanner.nextLine();
                    biblioteca.emprestarLivro(titulo);
                    break;
                case 3:
                    System.out.print("Digite o título do livro a ser devolvido: ");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLivro(titulo);
                    break;
                case 4:
                    biblioteca.listarTodosLivros();
                    break;
                case 5:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
