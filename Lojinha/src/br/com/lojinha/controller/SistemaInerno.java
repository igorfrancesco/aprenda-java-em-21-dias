package br.com.lojinha.controller;

import br.com.lojinha.util.assets.Autenticavel;

public class SistemaInerno {

	public void login(Autenticavel a) {
		Integer senha = 0;
		boolean ok = a.autentica(senha);
		System.out.println(ok);
	}

}
