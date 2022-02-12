package br.com.caelum.programa;

public class TesteErro {
	
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
		int[] array = new int[5];
		imprimeArray(array);
		
		
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		try {
			  for (int i = 0; i <= 15; i++) {
			      cc.deposita(i + 1000);
			      System.out.println(cc.getSaldo());
			      if (i == 5) {
			          cc = null;
			      }
			  }
			} catch (NullPointerException e) {
			  System.out.println("erro: " + e);
			}
		System.out.println("fim do metodo2");
	}
	
	static void imprimeArray(final int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        System.out.println(array[i]);
	    }
	}
	
}