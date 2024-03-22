public class Aluno {
    private String nome;
    private int idade;
    private int matricula;

    Aluno(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    //getters
    public String getNome () {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    //setters
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
