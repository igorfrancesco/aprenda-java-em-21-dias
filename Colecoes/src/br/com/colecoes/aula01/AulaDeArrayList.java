package br.com.colecoes.aula01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AulaDeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var lista = new ArrayList<String>();

		lista.add("Igor");
		lista.add("Mariana");
		lista.add("Maria");
		lista.add("Sebastião");
		lista.add("Douglas");
		lista.add("Raquel");

		String[] listaSimples = { "Caroline", "Laís", "Elisabete", "Tales", "Kaleb" };

		lista.addAll(Arrays.asList(listaSimples));

		System.out.println("O número de pessoas registradas são: " + lista.size() + "\nOs nomes são: \n -------");
		// System.out.println(lista.isEmpty());
		// System.out.println(lista.contains(listaSimples));

		try {
			Collections.sort(lista);
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i) + " - " + i);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.print(
					"Indice da posição que você quer acessar é null ou não existe! Para mais detalhes veja:\n " + e);
		}

		System.out.println("--------------------------------------");

		String[] novoArray = lista.toArray(new String[lista.size()]);
		System.out.println(Arrays.toString(novoArray));

		System.out.println("\n-------------- HashSet ----------------");

		var cargos = new HashSet<String>(Arrays.asList(novoArray));

		System.out.println(cargos);

		/*
		 * for (int j =0; j < novoArray.length; j++) { System.out.println(novoArray[j] +
		 * " " + j);
		 * 
		 * }
		 */

		System.out.println("\n----------------- Usando o Iterator ---------------------");
		for (var iterator = cargos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			System.out.println(string);
		}
		

	}

}
