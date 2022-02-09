package br.com.java8.aula;

public class Cliente implements Autentica {
	private String nome;
	private boolean status;
	private String senha;
	private int pontos;

	public Cliente(String nome, boolean status, String senha, int pontos) {
		super();
		this.nome = nome;
		this.status = status;
		this.senha = senha;
		this.pontos = pontos;
	}

	public String getNome() {
		System.out.println(this.nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticaSenha(String senha) {
		if (this.senha != senha) {
			System.out.println("N�o autenticado");
			return false;
		}
		System.out.println("Autenticado!");
		return true;
	}

}
