public class DVD extends Material{
    //Atributos
    double duracaoMinutos;

    //Construtor
    public DVD(int id, String titulo, boolean disponivel, double duracaoMinutos) {
        super(id, titulo, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    //Getters and Setters
    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "DVD {" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel + '\'' +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
    }
}

