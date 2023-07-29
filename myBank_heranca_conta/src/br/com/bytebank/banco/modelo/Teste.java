package br.com.bytebank.banco.modelo;
public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Object cc = new ContaCorrente(22, 7);
		guardador.adiciona(cc);
		
		Object cc2 = new ContaCorrente(22, 8);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Object ref =  guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		System.out.println(ref.getAgencia());
	}
	
}
