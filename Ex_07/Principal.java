public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Kevin", 21, 12120421);

        //exibindo os valores com getters
        System.out.println("Nome: " + a1.getNome() + "\nIdade: " + a1.getIdade() + "\nMatrícula: " + a1.getMatricula());

        //modificando os valores com setters
        a1.setNome("Thiago");
        a1.setIdade(22);
        a1.setMatricula(13130322);

        //exibindo os novos valores com getters
        System.out.println("\nNovo nome: " + a1.getNome() + "\nNova idade: " + a1.getIdade() + "\nNova matrícula: " + a1.getMatricula());
    }
}