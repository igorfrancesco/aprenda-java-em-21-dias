package br.com.java8.aula;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {

	public static void main(String[] args) {
		var c1 = new Cliente("Igor", true, "123", 5);
		var c2 = new Cliente("Barbara", true, "456", 10);
		var c3 = new Cliente("Ana", true, "333", 20);

		List<Cliente> clientes = Arrays.asList(c1, c2, c3);
		//clientes.forEach(c -> System.out.println(c.getPontos()));
		
		var stream = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toSet());
		
		// List<Cliente> pontosMaior = stream.collect(Collectors.toList());
		
		stream.forEach( c -> System.out.println(c.getPontos()));
		
		
		
		
	}

}
