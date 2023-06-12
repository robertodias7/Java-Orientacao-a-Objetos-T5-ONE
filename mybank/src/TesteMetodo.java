
public class TesteMetodo {

	public static void main(String[] args) {
		/*Foi criado um objeto chamado contaDoPaulo
		 *O objeto contaDoPaulo vai receber o atributo saldo com valor de 100 reais
		 *O objeto contaDoPaulo receberá o método deposita() com valor de 50 reais passado por parâmetro  */
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		//Mostra saldo
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20); // Método saca() recebe 20 reais por parâmetro para diminuir o valor
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);//Mostra true ou false
		
		/*Foi criado o objeto contaDaAna para depositar e transferir dinheiro para a contaDoPaulo*/
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);//Valor do depósito
		
		//Pelo o método trasfere() foi passado o valor da transferêcia e o destino da conta que é a contaDoPaulo
		contaDaAna.transfere(300, contaDoPaulo);
		System.out.println(contaDaAna.saldo);//saldo atual da conta da Ana depois da transferência 
		System.out.println(contaDoPaulo.saldo);//saldo atual da conta do Paulo depois da transferência

	}

}
