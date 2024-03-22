public class Funcionario {

    //atributos
    private String nome;
    private double salarioHora;
    private int horasTrabalhadas;

    //construtor
    public Funcionario(String nome, double salarioHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //métodos
    public String getNome() {
        return nome;
    }
    public double getSalarioHora() {
        return salarioHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularSalarioMensal(){
        return (getSalarioHora() * getHorasTrabalhadas());
    }
}
