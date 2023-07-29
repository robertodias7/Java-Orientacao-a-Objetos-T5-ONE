package br.com.bytebank.banco.modelo;


public class ContaCorrente extends Object implements Tributavel {
	//Construtores não são herdados.
	//A classe precisa escrever seu próprio contrutor
	//Mas através do super() podemos fazer a chamada do método da classe mãe 
	public ContaCorrente(int numero, int agencia) {
		super( numero, agencia);
	}
	
	@Override //É usado para sobrescrever o método da classe mãe, indicando que o método
			  //originnal foi modificado.
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2; 
		super.saca(valorASacar);//Um construtor da classe mãe pode ser chamado aatravés do super()
		
		
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente: " + super.toString();
	}
}

