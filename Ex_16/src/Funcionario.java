public class Funcionario {
    // Atributos
    private String nome;
    private double salario;
    private String departamento;

    // Construtor
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    // Método para aumentar o salário
    public static void aumentarSalario(Funcionario[] funcionarios, String departamento) {
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i].getDepartamento().equalsIgnoreCase(departamento)) {
                double novoSalario = funcionarios[i].getSalario() * 1.10;
                funcionarios[i].setSalario(novoSalario);
            }
        }
    }

    public static void main(String[] args) {
        // Criação do vetor de objetos Funcionario
        Funcionario[] funcionarios = new Funcionario[5];

        // Inicialização dos objetos Funcionario
        funcionarios[0] = new Funcionario("Alice", 3000.0, "TI");
        funcionarios[1] = new Funcionario("Bruno", 2500.0, "Marketing");
        funcionarios[2] = new Funcionario("Carla", 4000.0, "TI");
        funcionarios[3] = new Funcionario("Daniel", 3500.0, "Recursos Humanos");
        funcionarios[4] = new Funcionario("Elisa", 3200.0, "TI");

        // Aumenta o salário dos funcionários do departamento de TI em 10%
        aumentarSalario(funcionarios, "TI");

        // Impressão do nome, salário e departamento de cada funcionário após o aumento
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() +
                    ", Salário: " + funcionarios[i].getSalario() +
                    ", Departamento: " + funcionarios[i].getDepartamento());
        }
    }
}
