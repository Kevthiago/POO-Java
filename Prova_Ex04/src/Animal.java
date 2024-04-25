public class Animal {
    //Atributos
    String nome, idade, somEmitido;

    //Construtor
    public Animal(String nome, String idade, String somEmitido) {
        this.nome = nome;
        this.idade = idade;
        this.somEmitido = somEmitido;
    }

    //Métodos
    public String emitirSom(){
        return somEmitido;
    }
}
