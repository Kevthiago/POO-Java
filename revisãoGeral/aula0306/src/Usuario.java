public class Usuario {
    //Atributos
    private String nome;
    private int emprestimosAtivos;
    private int id;

    //Construtor
    public Usuario(String nome, int emprestimosAtivos, int id) {
        this.nome = nome;
        this.emprestimosAtivos = emprestimosAtivos;
        this.id = id;
    }

    //Getters and Setters
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //ToString
    @Override
    public String toString() {
        return "Usuario{" +
                "Nome= '" + nome + '\'' +
                ", Empréstimos Ativos= '" + emprestimosAtivos + '\'' +
                ", Id= " + id +
                '}';
    }
}
