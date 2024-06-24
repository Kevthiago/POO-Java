public class Revista extends Material{
    //Atributos
    int paginas;

    //Construtor
    public Revista(int id, String titulo, boolean disponivel, int paginas) {
        super(id, titulo, disponivel);
        this.paginas = paginas;
    }

    //Getters and Setters
    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Revista {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
