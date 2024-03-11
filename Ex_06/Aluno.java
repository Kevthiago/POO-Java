public class Aluno {
    // Atributos
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    double calcularMedia;
    Disciplina disciplina;

    // Métodos
    public void calcularMedia (){
        calcularMedia = (nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5;
        System.out.println("A média das notas do aluno é: " + calcularMedia);
    }
    public void situacaoAluno(){
        if (calcularMedia >= 6){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
    void alunoDisciplina (){
        System.out.println("O(a) aluno(a) " + nome + " está matriculado na disciplina: " +
                disciplina.nome + ".\nCarga horária da disciplina: " + disciplina.cargaHoraria  + " horas.");
    }

    // Construtor
    public Aluno(String nom, int matri, double mat, double por, double fis,
                 double geo, double quim, Disciplina dis){
        nome = nom ;
        matricula = matri;
        nota_mat = mat;
        nota_por = por;
        nota_fis = fis;
        nota_geo = geo;
        nota_quim = quim;
        disciplina = dis;
    }
}
