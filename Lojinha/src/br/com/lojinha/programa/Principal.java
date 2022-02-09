package br.com.lojinha.programa;

import br.com.lojinha.controller.ControleDeBonificacoes;
import br.com.lojinha.util.Funcionario;
import br.com.lojinha.util.Gerente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * var cliente = new Cliente();
		 * 
		 * cliente.setNome("Igor");
		 * 
		 * // JOptionPane.showMessageDialog(null, cliente.getNome());
		 * 
		 * var banco = new Banco();
		 * 
		 * banco.setName("Bradesco");
		 * 
		 * // JOptionPane.showMessageDialog(null, banco.getName());
		 * 
		 * 
		 * 
		 * var func = new Funcionario();
		 * 
		 * func.setSalario(3000); System.out.println(func.getSalario());
		 * System.out.println(func.getBonificacao());
		 * 
		 * System.out.println("------------------------------------------------------");
		 * 
		 * var gerente = new Gerente(); Funcionario funcionario = gerente;
		 * 
		 * funcionario.setSalario(5000); System.out.println(funcionario.getSalario());
		 * System.out.println(funcionario.getBonificacao());
		 * 
		 * System.out.println("------------------------------------------------------");
		 * 
		 */

		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setNome("Gerente");
		funcionario1.setSalario(5000);
		controle.registra(funcionario1);

		System.out.println(controle.getTotalDeBonificacoes());

	}

}
