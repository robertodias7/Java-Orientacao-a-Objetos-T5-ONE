package br.com.bytebank.banco.modelo;

/**
 * Classe criada para representar um Cliente no bytebank
 * 
 * @author Roberto Dias
 * 
 *
 */

public class Cliente {
	private String nome;
	private String CPF;
	private String agencia;
	private String titular;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
