package br.com.fiap.beans;

public class Admin {
	
	private int id;
	private String nome, dataNasc, sexo, telefone, email, senha;
	
	public Admin(String senha) {
		super();
	}
	
	public Admin(int id, String nome, String dataNasc, String sexo, String telefone, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", nome=" + nome + ", dataNasc=" + dataNasc + ", sexo=" + sexo + ", telefone="
				+ telefone + ", email=" + email + ", senha=" + senha + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getDataNasc()=" + getDataNasc() + ", getSexo()=" + getSexo() + ", getTelefone()="
				+ getTelefone() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


}
