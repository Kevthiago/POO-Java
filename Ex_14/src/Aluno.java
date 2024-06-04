public class Aluno {
    // Atributos
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public static void main(String[] args) {
        // Criação do vetor de objetos Aluno
        Aluno[] alunos = new Aluno[5];

        // Inicialização dos objetos Aluno
        alunos[0] = new Aluno("Alice", 8.5);
        alunos[1] = new Aluno("Bruno", 7.0);
        alunos[2] = new Aluno("Carla", 9.2);
        alunos[3] = new Aluno("Daniel", 6.8);
        alunos[4] = new Aluno("Elisa", 7.5);

        // Impressão do nome e da nota de cada aluno
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].getNome() + ", Nota: " + alunos[i].getNota());
        }
    }
}
