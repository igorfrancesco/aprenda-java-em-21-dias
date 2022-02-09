package br.com.lojinha.controller;

import br.com.lojinha.util.Funcionario;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		System.out.println("Adicionando bonifica��o do funcionario: " + funcionario.getNome());
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
