public class Regular extends Funcionario{

    //construtor
    public Regular(String nome, double salarioHora, int horasTrabalhadas) {
        super(nome, salarioHora, horasTrabalhadas);
    }

    //métodos
    @Override
    public double calcularSalarioMensal(){
        return super.calcularSalarioMensal();
    }
}
