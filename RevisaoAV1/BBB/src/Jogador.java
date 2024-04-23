public class Jogador {
    //Atributos
    private final String nome;
    private int votos;

    //Construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getVotos() {
        return votos;
    }

    //Métodos
    public void adicionarVotos(){
        votos++;
    }
}
