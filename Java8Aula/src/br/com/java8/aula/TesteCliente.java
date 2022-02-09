package br.com.java8.aula;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteCliente {

	public static void main(String[] args) {

		//var c1 = new Cliente("Igor", true, "123");
		//var c2 = new Cliente("Barbara", true, "456");
		// c1.autenticaSenha("123");

		//List<Cliente> clientes = Arrays.asList(c1, c2);
		/*
		 * Consumer<Cliente> consumidor = new Consumer<Cliente>() { // CLASSE ANÔNIMA 
		 * public void accept(Cliente c) { 
		 *         System.out.println(c.getNome());
		 *         System.out.println(c.getSenha()); 
		 *     } 
		 *  };
		 */
		
		/* Consumer<Cliente> consumidor = (Cliente c) -> { // EXPRESSÃO LAMBDA
		 *           System.out.println(c.getNome());          
		 * };
		 */
		// clientes.forEach(c -> System.out.println(c.getNome())); // EXPRESSÃO LAMBDA
		
		
		/* REFERÊNCIA DE MÉDOTO 
		 *    clientes.forEach(Cliente::getNome);
		 *    var c3 = new Cliente("Ana", false, "333");
		 * 
		 *  Consumer<Cliente> consumidor1 = Cliente::getNome; 
		 *  consumidor1.accept(c3);
		 * 	
		 *  Runnable r1 = c3::getNome; r1.run(); 
		*/
		
		Runnable r = () -> System.out.println("Olá mundo!!!"); // EXPRESSÃO LAMBDA
		new Thread(r).start();
		
		
		
		
	}

}
