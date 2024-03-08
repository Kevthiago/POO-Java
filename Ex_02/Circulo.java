import java.lang.Math;
public class Circulo {

    //Acesso à pi
    double pi = Math.PI;

    //Atributos
    float raio;

    //Métodos
    void area (double a){
        a = Math.PI * (raio * raio);
        System.out.println("A área do círculo cujo raio é " + raio + " é " + a);
    }
    void perimetro (double p){
        p = 2 * Math.PI * raio;
        System.out.println("O perímetro do círculo cujo raio é " + raio + " é " + p);
    }
}
