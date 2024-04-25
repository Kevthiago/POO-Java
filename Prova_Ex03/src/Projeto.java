abstract class Projeto {
    //Atributos
    private String nomeProjeto, descricao, endereco, dataInicio, dataFim;

    //Construtor
    public Projeto(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    //Getters and Setters
    public String getNomeProjeto() {
        return nomeProjeto;
    }
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    //Métodos
    abstract boolean validaProjeto(String nomeProjeto);
    abstract String imprimeProjeto();

}
