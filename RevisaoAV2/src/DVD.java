public class DVD extends Material{
    //Atributos específicos
    private double duracao;

    //Construtor
    public DVD(String titulo, int id, double duracao, boolean disponivel) {
        super(titulo, id,  disponivel);
        this.duracao = duracao;
    }

    //Getters and Setters
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    //ToString
    @Override
    public String toString() {
        return super.toString() + "Duração= " + duracao;
    }
}
