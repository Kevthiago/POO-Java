public class TestePessoas {
    public static void main (String[] arg){

        //Criação de objetos
        Pessoa c1 = new Pessoa();
        Pessoa c2 = new Pessoa();

        //Atribuições
        c1.nome = "Kevin";
        c1.cidade = "Desterro de Entre Rios";
        c1.idade = 21;

        c2.nome = "Chris Hermsworth";
        c2.cidade = "Asgard";
        c2.idade = 35;

        //Teste
        System.out.println("Pessoa 01:");
        c1.apresentar();
        System.out.println("\nPessoa 02:");
        c2.apresentar();
    }
}
