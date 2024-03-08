public class TesteBanco {
    public static void main (String[] arg){
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();

        //Criação objeto 1
        c1.titular = "Kevin";
        c1.numero =  12120421;
        c1.saldo = 1500f;

        //Criação objeto 2
        c2.titular = "Gabriella";
        c2.numero = 10072002;
        c2.saldo = 2000f;

        //Teste objeto 1
        c1.depositar(235f);
        c1.sacar(35f);
        c1.exibir();

        //Teste objeto 2
        c2.depositar(1245f);
        c2.sacar(396f);
        c2.exibir();
    }
}
