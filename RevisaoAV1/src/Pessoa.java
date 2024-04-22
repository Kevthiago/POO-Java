public class Pessoa {

    //Atributos
    private String nome;
    private int idade;

    //Contrutor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos
    public String imprimirDetalhes(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }

    public static void main(String[] args) {
        //Instanciando objetos
        Pessoa p1 = new Pessoa("Kevin", 21);

        //Teste
        System.out.println(p1.imprimirDetalhes());
    }
}


