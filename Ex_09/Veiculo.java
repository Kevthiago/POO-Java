public class Veiculo {
    //atributos
    private String marca, modelo;
    private int ano;

    //construtor
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //métodos
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno();
    }
}
