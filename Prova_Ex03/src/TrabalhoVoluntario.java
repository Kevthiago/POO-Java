public class TrabalhoVoluntario extends Projeto{
    //Atributos
    private String tipoTrabalho;
    private int duracaoTrabalho;

    //Construtor
    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    //Getters and Setters
    public String getTipoTrabalho() {
        return tipoTrabalho;
    }
    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }
    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }
    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    //Métodos
    @Override
    boolean validaProjeto(String nomeProjeto) {
        if (getDuracaoTrabalho() > 2){
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
                + "\nTipo de trabalho: " + getTipoTrabalho()
                + "\nDuração do trabalho em dias: " + getDuracaoTrabalho();
    }

}
