public class Material {
    //Atributos
    int id;
    String titulo;
    boolean disponivel;
    static int totalMateriais = 0;

    //Construtor
    public Material(int id, String titulo, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
        totalMateriais++;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Material {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }

    public static int contarMateriais(){
        return totalMateriais;
    }

    public void cadastrarMaterial(){
        new Material(id, titulo, disponivel);
    }
}
