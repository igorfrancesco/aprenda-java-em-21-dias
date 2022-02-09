package br.com.java8.aula;

@FunctionalInterface
public interface Autentica {
	public abstract boolean autenticaSenha(String senha);
}
