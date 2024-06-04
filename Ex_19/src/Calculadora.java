import java.util.Scanner;

class Calculadora {
    // Método para somar dois números
    public static double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dois números
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;  // Retorna NaN se tentar dividir por zero
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Testando os métodos da Calculadora
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scn.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scn.nextDouble();

        System.out.println("Soma de " + num1 + " e " + num2 + " = " + Calculadora.somar(num1, num2));
        System.out.println("Subtração de " + num1 + " e " + num2 + " = " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação de " + num1 + " e " + num2 + " = " + Calculadora.multiplicar(num1, num2));
        System.out.println("Divisão de " + num1 + " por " + num2 + " = " + Calculadora.dividir(num1, num2));

    }
}
