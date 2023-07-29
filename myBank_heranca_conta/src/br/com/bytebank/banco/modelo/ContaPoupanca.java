package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Object {
	//Construtores não são herdados.
	//A classe precisa escrever seu próprio contrutor
	//Mas através do super() podemos fazer a chamada do método da classe mãe 
	public ContaPoupanca(int numero, int agencia) {
		super( numero, agencia);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		
		return "ContaPoupança " + super.toString();
	}
}
