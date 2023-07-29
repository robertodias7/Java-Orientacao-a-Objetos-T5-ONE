package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Object;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteString {

	public static void main(String[] args) {
		Object cc = new  ContaCorrente(22, 266);
		Object cp = new ContaPoupanca(27, 2);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		
	}
		
		
		
		static void println()
		{	}
		
		static void println(Object conta){

	}
		static void println(int a) {
			
		}

}
