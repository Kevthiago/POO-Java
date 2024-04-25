public class ProdutoEletronico implements Promocao {
    //Atributos
    String modelo, marca;
    double preco;

    //Construtor
    public ProdutoEletronico(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    //Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos
    @Override
    public double calcularDesconto() {
        return preco = (preco * 0.1);
    }
}
