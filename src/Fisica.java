public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String genero;
    private int nasc;

    Fisica(String nome, String logradouro, String bairro, String cidade, String uf, String cpf, String rg, String genero, int nasc){
        super(nome, logradouro, bairro, cidade, uf);
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.nasc = nasc;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return rg;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void setNasc(int nasc){
        this.nasc = nasc;
    }
    public int getNasc(){
        return nasc;
    }

    public static void add(Fisica objFisica) {
        
    }
}