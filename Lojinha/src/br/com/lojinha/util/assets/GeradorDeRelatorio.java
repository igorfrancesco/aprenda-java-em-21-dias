package br.com.lojinha.util.assets;

import br.com.lojinha.util.EmpregadoDaFaculdade;

public class GeradorDeRelatorio {

	public void adiciona(EmpregadoDaFaculdade f) {
		System.out.println(f.getInfo());
		System.out.println(f.getGastos());
	}

}
