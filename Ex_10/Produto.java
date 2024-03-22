public class Produto {
    //atributos
    private String nome;
    private double precoUnitario;
    private int quantidadeEmEstoque;
    //construtor
    public Produto(String nome, double precoUnitario, int quantidadeEmEstoque){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    //métodos
    public String getNome() {
        return nome;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public void adicionarEstoque (int estoque){
        quantidadeEmEstoque = getQuantidadeEmEstoque() + estoque;
    }
    public void removerEstoque (int estoque){
        if (getQuantidadeEmEstoque() >= estoque) {
            quantidadeEmEstoque = getQuantidadeEmEstoque() - estoque;
        } else {
            System.out.println("Não foi possível remover o produto. Estoque insulficiente!");
        }
    }
    public String detalhes(){
        return "Nome: " + getNome() + "\nPreço: " + getPrecoUnitario() + "\nQuantidade disponível: " + getQuantidadeEmEstoque() + "\n";
    }
}
