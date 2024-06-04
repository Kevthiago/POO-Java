public class Material {
    protected String titulo;
    protected int anoPublicacao;
     //contrutor
    public Material(String titulo, int anoPublicacao, boolean disponivel){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}