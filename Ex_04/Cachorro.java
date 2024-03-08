public class Cachorro {
    //atributos
    String Raca, cor;
    int tamanho;
    boolean tem_rabo;

    //métodos
    void late(){
        String mensagemRabo = tem_rabo ? "tenho rabo" : "não tenho rabo";
        System.out.println("Au au!\nEu sou um " + Raca + " de tamanho " + tamanho + "cm, minha cor é " + cor + " e eu " + mensagemRabo + ".");
    }
}
