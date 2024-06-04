public class Livro extends Material{
    //Atributos específicos
    private String autor;

    //Construtor
    public Livro(String titulo, int id, String autor, boolean disponivel) {
        super(titulo, id, disponivel);
        this.autor = autor;
    }

    //Getters and Setters
    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "Autor= " + autor + "\n";
    }
}
