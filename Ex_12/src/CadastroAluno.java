import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++){
            System.out.println("Insira o nome aluno: " + (i + 1) + ":");
            String nome = scn.nextLine();

            System.out.println("Insira a idade do aluno: " + (i + 1) + ":");
            int idade = Integer.parseInt(scn.nextLine());

            alunos[i] = new Aluno(nome, idade);
        }
        System.out.println("---------------------------------------");
        System.out.println("Dados dos alunos cadastrados:");
        System.out.println("---------------------------------------");
        for (Aluno aluno : alunos) {
            if (aluno != null){
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("----------------------------");
            }
        }

    }
}
