package br.com.caelum.programa;

public class Conta {

	private String titular;
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
}
