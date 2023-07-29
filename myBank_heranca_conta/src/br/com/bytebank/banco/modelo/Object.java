package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma moldura de uma conta bancária
 * 
 * @author Roberto Dias
 *
 */


public abstract class Object {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Contrutor para inicializar o objeto Conta a partir da agência e número
	 * 
	 * @param numero
	 * @param agencia
	 */

	public Object(int numero, int agencia) {
		Object.total++;
		if(this.agencia < 0) {
			throw new IllegalArgumentException("Agência Inválida");
		}
		//System.out.println("O total de contas é: " + Conta.total);
		if(numero < 1) {
			throw new IllegalArgumentException("Número da Conta Inválido");
		}
		this.numero = numero;
		this.agencia = agencia;
		//this.saldo = 0;
		//System.out.println("Conta número: " + this.numero);
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor ) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
		
	}

	public void transfere(double valor, Object destino)throws SaldoInsuficienteException {
		this.saca(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor igual a zero(0)");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor igual a zero(0)");
			return;
		}
		this.agencia = agencia;
	}

	public static int getTotal() {
		return total;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		
		return "Numero: " + this.numero +  " " + "Agencia: " + this.agencia;
	}
}


