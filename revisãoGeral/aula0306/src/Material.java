public class Material {
    //Atributos gerais
    private String titulo;
    private int id;
    private boolean disponivel = true;

    //Contrutor geral
    public Material(String titulo, int id, boolean disponivel) {
        this.titulo = titulo;
        this.id = id;
        this.disponivel = disponivel;
    }

    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //ToString
    @Override
    public String toString() {
        return "Material" +
                "Título= '" + titulo + '\'' +
                ", Id= '" + id + '\'' +
                ", Disponível= " + disponivel;
    }

    //Método para ver disponibilidade
}
