import java.util.List;

public class Material {
    //Atributos gerais
    private String titulo;
    private int id;
    private boolean disponivel = true;
    private static int totalMateriais = 0;

    //Contrutor geral
    public Material(String titulo, int id, boolean disponivel) {
        this.titulo = titulo;
        this.id = id;
        this.disponivel = disponivel;
        totalMateriais++;
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
        return "Material: " +
                "Título= " + titulo +
                ", Id= " + id +
                ", Disponível= " + disponivel + ", ";
    }

    //Método para contar materiais
    public static int contarMateriais(){
        return totalMateriais;
    }

    //Método para realizar empréstimo
    public static boolean realizarEmprestimo(Usuario usuario, Material material){
        if (material.isDisponivel()){
            material.setDisponivel(false); //Passa a disponibilidade para falso
            usuario.incrementarEmprestimo(); //Incrementa empréstimo ao usuário
            System.out.println("Empréstimo realizado com sucesso: " + material.getTitulo());
            return true;
        } else {
            System.out.println("Material não disponível para empréstimo: " + material.getTitulo());
            return false;
        }
    }

    //Método para devolver empréstimp
    public static void devolverEmprestimo(Usuario usuario, Material material){
        if (!material.isDisponivel()){
            material.setDisponivel(true); //Passa a disponibilidade para verdadeiro
            usuario.decrementarEmprestimo(); //Decrementa empréstimo ao usuário
            System.out.println("Empréstimo devolvido com sucesso: " + material.getTitulo());
        } else {
            System.out.println("Material já está disponível: " + material.getTitulo());
        }
    }

    //Método para listar materiais
    public static void listarMateriais(List<Material> materiais) {
        for (Material material : materiais) {
            System.out.println(material);
        }
    }
}
