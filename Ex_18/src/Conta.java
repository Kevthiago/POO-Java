import java.util.Scanner;

class Conta {
    // Atributos
    private int numero;
    private String titular;
    private double saldo;

    // Construtor
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta de " + destino.getTitular());
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    @Override
    public String toString() {
        return "Conta número: " + numero + ", Titular: " + titular + ", Saldo: R$" + saldo;
    }
}

class Banco {
    // Atributos
    private Conta[] contas;
    private int numContas;

    // Construtor
    public Banco(int tamanho) {
        contas = new Conta[tamanho];
        numContas = 0;
    }

    // Método para adicionar uma nova conta
    public void adicionarConta(Conta conta) {
        if (numContas < contas.length) {
            contas[numContas] = conta;
            numContas++;
            System.out.println("Conta adicionada com sucesso.");
        } else {
            System.out.println("Não foi possível adicionar a conta. O banco está cheio.");
        }
    }

    // Método para depositar em uma conta
    public void depositar(int numeroConta, double valor) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNumero() == numeroConta) {
                contas[i].depositar(valor);
                System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + contas[i].getTitular());
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    // Método para sacar de uma conta
    public void sacar(int numeroConta, double valor) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNumero() == numeroConta) {
                if (contas[i].sacar(valor)) {
                    System.out.println("Saque de R$" + valor + " realizado com sucesso na conta de " + contas[i].getTitular());
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    // Método para transferir dinheiro entre duas contas
    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta origem = null;
        Conta destino = null;

        // Encontrar as contas de origem e destino
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNumero() == numeroContaOrigem) {
                origem = contas[i];
            }
            if (contas[i].getNumero() == numeroContaDestino) {
                destino = contas[i];
            }
        }

        // Realizar a transferência se as contas foram encontradas
        if (origem != null && destino != null) {
            origem.transferir(destino, valor);
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }

    // Método para listar todas as contas com suas informações
    public void listarContas() {
        System.out.println("Lista de Contas:");
        for (int i = 0; i < numContas; i++) {
            System.out.println(contas[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(10);
        Scanner scanner = new Scanner(System.in);

        // Adicionar algumas contas
        banco.adicionarConta(new Conta(123456, "Ana Silva", 5000));
        banco.adicionarConta(new Conta(987654, "Carlos Oliveira", 8000));
        banco.adicionarConta(new Conta(456789, "Maria Santos", 3000));

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Adicionar conta");
            System.out.println("5. Listar todas as contas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da conta e o valor para depositar: ");
                    int numeroContaDepositar = scanner.nextInt();
                    double valorDepositar = scanner.nextDouble();
                    banco.depositar(numeroContaDepositar, valorDepositar);
                    break;
                case 2:
                    System.out.print("Digite o número da conta e o valor para sacar: ");
                    int numeroContaSacar = scanner.nextInt();
                    double valorSacar = scanner.nextDouble();
                    banco.sacar(numeroContaSacar, valorSacar);
                    break;
                case 3:
                    System.out.print("Digite o número da conta de origem, o número da conta de destino e o valor para transferir: ");
                    int numeroContaOrigem = scanner.nextInt();
                    int numeroContaDestino = scanner.nextInt();
                    double valorTransferir = scanner.nextDouble();
                    banco.transferir(numeroContaOrigem, numeroContaDestino, valorTransferir);
                    break;
                case 4:
                    System.out.print("Digite o número da conta, o nome do titular e o saldo inicial: ");
                    int numeroConta = scanner.nextInt();
                    String nomeTitular = scanner.next();
                    double saldoInicial = scanner.nextDouble();
                    banco.adicionarConta(new Conta(numeroConta, nomeTitular, saldoInicial));
                    break;
                case 5:
                    banco.listarContas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

