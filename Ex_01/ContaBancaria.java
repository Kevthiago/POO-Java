public class ContaBancaria {
    //Atributos
    int numero;
    float saldo;
    String titular;

    //Métodos
    void depositar (float add){
        saldo += add;
        System.out.println("O valor depositado por " + titular + " em " + numero + " foi de " + add + " reais. " +
                "\nO saldo atual da conta " + numero + " é de " + saldo + " reais.");
    }
    void sacar (float sub){
        saldo -= sub;
        System.out.println("O valor sacado por " + titular + " em " +numero+ " foi de " + sub + " reais. " +
                "\nO saldo atual da conta " + numero + " é de " + saldo + " reais.");
    }
    void exibir (){
        System.out.println("O saldo atual da conta " + numero + " cujo titular " + titular + " é de " + saldo + " reais.");
    }
}
