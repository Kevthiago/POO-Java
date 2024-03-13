public class Principal {
    public static void main (String[] arg){
        
        // Instanciação de objeto
        Disciplina d1 = new Disciplina("Química", 80);
        Disciplina d2 = new Disciplina("Física", 80);

        Aluno a1 = new Aluno("Kevin Thiago dos Santos", 12120421, 7,
                8, 8, 10, 9, d1);
        Aluno a2 = new Aluno("Polyane Aparecida de Resende", 11110320, 8,
                10, 6, 8, 7, d2);

        // Chamando os métodos
        System.out.println(a1);
        a1.alunoDisciplina();
        a1.calcularMedia();
        a1.situacaoAluno();

        System.out.println(a2);
        a2.alunoDisciplina();
        a2.calcularMedia();
        a2.situacaoAluno();
    }
}