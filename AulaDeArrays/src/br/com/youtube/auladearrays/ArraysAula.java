package br.com.youtube.auladearrays;

public class ArraysAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] paises = {"Brasil", "Rússia", "Holanda", "EUA", "Japão"};

		args = new String[1];
		
		for (String argumentos: args) {
			System.out.println(argumentos + "\n -");
		}
		
		int i = 0;
		while (i <= 4 ) {
			System.out.println(paises[i]);
			i++;
		}
		
	}

}
