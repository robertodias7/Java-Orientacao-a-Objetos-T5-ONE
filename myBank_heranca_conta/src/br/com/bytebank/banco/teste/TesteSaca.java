package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Object;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


public class TesteSaca {

	public static void main(String[] args)throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
		Object conta = new ContaCorrente(147, 78);
		
		conta.deposita(200);
		conta.saca(210);
		
		System.out.println(conta.getSaldo());

	}

}
