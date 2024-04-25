public class Peixe extends Animal implements AnimalAquatico{
    //Atributos
    String tipoHabitat;

    //Construtor
    public Peixe(String nome, String idade, String somEmitido) {
        super(nome, idade, somEmitido);
    }
 //Métodos
    @Override
    public String emitirSom() {
        return super.emitirSom();
    }

    @Override
    public void nadar() {
        System.out.println("Estou nadando pelas profundezas!!!!");
    }
}
