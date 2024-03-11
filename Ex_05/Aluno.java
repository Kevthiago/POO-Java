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

    // Métodos
    public void calcularMedia (){
        calcularMedia = (nota_mat + nota_por + nota_fis + nota_geo + nota_quim) / 5;
        System.out.println("A média das notas do aluno é: " + calcularMedia);
    }
    void situacaoAluno(){
        if (calcularMedia >= 6){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    // Construtor
    public Aluno(String nom, int matri, double mat, double por, double fis,
                 double geo, double quim){
        nome = nom ;
        matricula = matri;
        nota_mat = mat;
        nota_por = por;
        nota_fis = fis;
        nota_geo = geo;
        nota_quim = quim;
    }
}
