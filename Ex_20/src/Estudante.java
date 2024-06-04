class Estudante {
    // Atributos
    private String nome;
    private double nota;

    // Construtor
    public Estudante(String nome, double nota) {
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

    // Método estático para calcular a média das notas de um array de estudantes
    public static double calcularMedia(Estudante[] estudantes) {
        double soma = 0.0;
        for (Estudante estudante : estudantes) {
            soma += estudante.getNota();
        }
        return soma / estudantes.length;
    }

    public static void main(String[] args) {
        // Criação de um array de estudantes
        Estudante[] estudantes = new Estudante[5];

        // Inicialização dos objetos Estudante
        estudantes[0] = new Estudante("Alice", 8.5);
        estudantes[1] = new Estudante("Bruno", 7.0);
        estudantes[2] = new Estudante("Carla", 9.2);
        estudantes[3] = new Estudante("Daniel", 6.8);
        estudantes[4] = new Estudante("Elisa", 7.5);

        // Cálculo e impressão da média das notas dos estudantes
        double media = Estudante.calcularMedia(estudantes);
        System.out.println("A média das notas dos estudantes é: " + media);
    }
}
