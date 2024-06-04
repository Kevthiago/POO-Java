public class Revista extends Material{
    //Atributos específicos.
    private int quantidadePaginas;
    private String editora;
    //Construtor
    public Revista(String titulo, int id,String editora, boolean disponivel) {
        super(titulo, id, disponivel);
        this.editora = editora;
    }

    //Getters and Setters
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "Editora= " + editora;
    }
}
