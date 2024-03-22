public class Terceirizado extends Funcionario {

    // atributo
    private double adicionalPagamentoTerceirizado;

    // construtor
    public Terceirizado(String nome, double salarioHora, int horasTrabalhadas, double adicionalPagamentoTerceirizado) {
        super(nome, salarioHora, horasTrabalhadas);
        this.adicionalPagamentoTerceirizado = adicionalPagamentoTerceirizado; // inicializando o atributo
    }

    // métodos
    @Override
    public double calcularSalarioMensal() {
        return super.calcularSalarioMensal() * adicionalPagamentoTerceirizado; // multiplicando pelo adicional
    }
}
