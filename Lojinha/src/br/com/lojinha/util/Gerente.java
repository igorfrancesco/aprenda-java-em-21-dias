package br.com.lojinha.util;

import br.com.lojinha.util.assets.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	private Integer senha;
	private Integer numeroDeFuncionariosGerenciados;

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Integer getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(Integer numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

	public double cadastro(Double teste) {
		return teste;
	}

	public boolean autentica(Integer senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

}
