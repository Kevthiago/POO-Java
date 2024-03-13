public class Aluno {
    // Atributos
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    Disciplina disciplina_main;

    // Métodos
    public double calcularMedia (){
        return ((nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5);
    }
    public void situacaoAluno(){
        if (calcularMedia() >= 6){
            System.out.println("Aluno(a) aprovado!\n");
        } else {
            System.out.println("Aluno(a) reprovado!\n");
        }
    }
    void alunoDisciplina (){
        System.out.println("O(a) aluno(a) " + nome + " está matriculado(a) na disciplina: " +
                disciplina_main.nome + ".\nCarga horária da disciplina: " + disciplina_main.cargaHoraria  + " horas."
                + "\nA média das notas do(a) aluno(a) é: " + calcularMedia());
    }

    // Construtor
    public Aluno (String nome, int matricula, double nota_mat,
    double nota_por, double nota_fis, double nota_geo, double nota_quim, Disciplina disciplina_main){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
        this.disciplina_main = disciplina_main;
    }
}
