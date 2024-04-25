public class Mamifero extends Animal{
    //Atributos
    int quantidadeMamas;

    //Construtor
    public Mamifero(String nome, String idade, String somEmitido) {
        super(nome, idade, somEmitido);
    }

    //Métodos
    @Override
    public String emitirSom() {
        return super.emitirSom();
    }
}
