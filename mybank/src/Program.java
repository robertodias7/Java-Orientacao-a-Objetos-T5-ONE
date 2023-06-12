
public class Program {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 500;
		primeiraConta.agencia = 12345;
		primeiraConta.numero = 1;
		primeiraConta.titular = "Roberto Dias";
		
		
		Conta segundaConta = primeiraConta;
		
		/*A variável segundaConta recebe por referência o endereço da variável primeiraConta*/
		
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Número: " + primeiraConta.numero);
		System.out.println("Titular: " + primeiraConta.titular);
		
		System.out.println(segundaConta.saldo);
		
	}

}
