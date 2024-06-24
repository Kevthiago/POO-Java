public class Livro extends Material{
    //Atributos
    String autor;

    //Construtor
    public Livro(int id, String titulo, boolean disponivel, String autor) {
        super(id, titulo, disponivel);
        this.autor = autor;
    }

    //Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel + '\'' +
                ", autor='" + autor +
                '}';
    }
}

