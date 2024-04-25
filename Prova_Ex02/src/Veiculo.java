abstract class Veiculo implements Alugavel{
    String modelo, marca;
    int anoFabricacao;
    boolean disponivel;

    //Construtor

    public Veiculo(String modelo, String marca, int anoFabricacao, boolean disponivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.disponivel = disponivel;
    }

    //Métodos
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean alugar() {
        if(disponivel){
            System.out.println("Você pode alugar o veículo!");
        } else {
            System.out.println("Indisponível para alguel no momento!");
        }
        return true;
    }
    @Override
    public void devolver() {
        if (!disponivel){
            System.out.println("Devolvendo carro para a garagem...");
        } else {
            System.out.println("O carro já foi devolvido!");
        }
    }
}
