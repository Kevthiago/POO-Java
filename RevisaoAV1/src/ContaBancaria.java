public class ContaBancaria {
    //Atributos
    double saldo;
    String numeroConta;

    //Construtor
    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //Métodos
    public double depositar(double valor){
        return saldo = saldo + valor;

    }
    public double sacar(double valor){
        return saldo = saldo - valor;
    }
    public String exibir(){
        return "Saldo da conta: " + saldo;
    }

    public static void main(String[] args) {
        //Instanciando objetos
        ContaBancaria c1 = new ContaBancaria(100000, "12120421");

        //Testes
        System.out.println(c1.exibir());
        c1.depositar(30000);
        System.out.println(c1.exibir());
        c1.sacar(10000);
        System.out.println(c1.exibir());
    }
}
