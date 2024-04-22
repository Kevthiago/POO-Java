public class Retangulo {
    //Atributos
    double comprimento, largura;

    //Construtor
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    //Métodos
    public double calcArea(){
        return comprimento * largura;
    }

    public double calcPerimetro(){
        return 2 * (comprimento * largura);
    }

    public static void main(String[] args) {
        //Instanciando objetos
        Retangulo r1 = new Retangulo(2.5, 4);

        System.out.println("Área: " + r1.calcArea() + "\nPerímetro: " + r1.calcPerimetro());
    }
}
