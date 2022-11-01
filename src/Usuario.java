public class Usuario extends Colaborador{
    private String login;
    private String senha;
    private String permissao;

	Usuario(String nome, String logradouro, String bairro, String cidade, String uf, String cpf, String rg, String genero, int nasc, String ctps, String login, String senha){
        super(nome, logradouro, bairro, cidade, uf, cpf, rg, genero, nasc, ctps);
        this.login = login;
        this.senha = senha;
}

    public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public void editarPerfil(){
		System.out.println("\nEditar perfil ");
	}
    
	public void alterarSenha(){
		System.out.println("\nAlteracao de senha ");
	}
	
	public void criarUsuario(){
		System.out.println("\nUsuario criado ");
	}
	
	public void apagarUsuario(){
		System.out.println("\nUsuario apagado ");
	}
	
}