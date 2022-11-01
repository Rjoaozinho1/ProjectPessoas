public class Juridica extends Pessoa{

    private String cnpj;
    private String inscricaoEstadual;
    private int fundacao;

    Juridica(String nome, String logradouro, String bairro, String cidade, String uf, String cnpj){
        super(nome, logradouro, bairro, cidade, uf);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getInscricaoEstadual(){
        return inscricaoEstadual;
    }

    public void setFundacao(int fundacao){
        this.fundacao = fundacao;
    }
    public int getFundacao(){
        return fundacao;
    }

    public static void add(Juridica objJuridica) {
    }
}