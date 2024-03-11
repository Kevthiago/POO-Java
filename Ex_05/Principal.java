public class Principal {
    public static void main (String[] arg){
        // Instanciação de objeto
        Aluno a1 = new Aluno("Kevin Thiago dos Santos", 12120421, 7, 8, 8, 10, 9);

        // Chamando os métodos
        System.out.println("Aluno: " + a1.nome);
        System.out.println("Matrícula: " + a1.matricula);
        a1.calcularMedia();
        a1.situacaoAluno();
    }
}