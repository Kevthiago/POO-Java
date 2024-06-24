public class Usuario {
    //Atributos
    private int id;
    private String nome;
    private int emprestimosAtivos;

    //Construtor
    public Usuario(int id, String nome, int emprestimosAtivos) {
        this.id = id;
        this.nome = nome;
        this.emprestimosAtivos = emprestimosAtivos;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(int emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }

    public void emprestimo(Material material){
        if (material.isDisponivel()){
            material.setDisponivel(false);
            this.emprestimosAtivos++;
            System.out.println("Material " + material.getTitulo() + " emprestado com sucesso para " + this.nome);
        } else {
            System.out.println("Material " + material.getTitulo() + " não está disponível");
        }
    }

    public void devolver(Material material){
        if (!material.isDisponivel()){
            material.setDisponivel(true);
            this.emprestimosAtivos--;
            System.out.println("Material " + material.getTitulo() + " devolvido com sucesso por " + this.nome);
        } else {
            System.out.println("Material " + material.getTitulo() + " já está disponível");
        }
    }

}
