package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Object;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteReferecia {

	public static void main(String[] args) {
		
		Object[] referencia = new  Object[5];
		ContaCorrente cc1 = new ContaCorrente(22,55);
		referencia[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(25, 52);
		referencia[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencia[2] = cliente;
		
		//System.out.println(contas[1].getNumero());
		ContaPoupanca ref = (ContaPoupanca) referencia[1];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}

}
