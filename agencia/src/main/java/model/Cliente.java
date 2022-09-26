package model;

public class Cliente {

	private int id;
	private String CPF;
	private String nome;
	private String Email;
	private String senha;
	private String Sexo;

	public Cliente() {
	}

	public Cliente(int id, String nome, String CPF, String Email, String senha, String Sexo) {
		this.id = id;
		this.CPF = CPF;
		this.nome = nome;
		this.Email = Email;
		this.senha = senha;
		this.Sexo = Sexo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSexo() {
		return this.Sexo;
	}

	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}

}
