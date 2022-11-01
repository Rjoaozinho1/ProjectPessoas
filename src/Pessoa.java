public class Pessoa{

    private int id;
    private String nome;
    private String nomeFantasia;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cnpj;
    private String cidade; 
    private String uf;

    Pessoa(String nome, String logradouro, String bairro, String cidade, String uf){
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public String getLogradouro(){
        return logradouro;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public String getComplemento(){
        return complemento;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }

    public void setUf(String uf){
        this.uf = uf;
    }
    public String getUf(){
        return uf;
    }
}