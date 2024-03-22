public class Main {
    public static void main(String[] args) {

        //instanciando objetos
        Funcionario f1 = new Regular("Kevin", 5, 160);
        Funcionario f2 = new Terceirizado("Daniel", 3, 160, 1.5);

        //teste dos métodos
        System.out.println(f1.calcularSalarioMensal());
        System.out.println(f2.calcularSalarioMensal());
    }
}
