package br.com.youtube.auladearrays;

import java.util.Collection;
import java.util.TreeSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new TreeSet<>();
		long inicio = System.currentTimeMillis();

		long total = 900000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}

}
