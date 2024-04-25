public class DistribuicaoAlimentos extends Projeto{
    //Atributos
    private String descAlimento;
    private float qtde;

    //Construtor
    public DistribuicaoAlimentos(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    //Getters and Setters
    public String getDescAlimento() {
        return descAlimento;
    }
    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }
    public float getQtde() {
        return qtde;
    }
    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    //Métodos
    @Override
    boolean validaProjeto(String nomeProjeto) {
        if (getDataFim().isEmpty()){
            return true;
        } else
        return false;
    }

    @Override
    String imprimeProjeto() {
        return "Nome do Projeto: " + getNomeProjeto()
                + "\nDescrição: " + getDescricao()
                + "\nData de início: " + getDataInicio()
                + "\nData de fim: " + getDataFim()
                + "\nDescrição do Alimento: " + getDescAlimento()
                + "\nQuantidade em kg: " + getQtde();
    }

}
