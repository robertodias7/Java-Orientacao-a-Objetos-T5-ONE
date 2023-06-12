package myBank_associacao;

public class TesteMyBank {

	public static void main(String[] args) {
			Cliente paulo = new Cliente();
			paulo.nome = "Paulo";
			paulo.cpf = "222.222.222-33";
			paulo.profissao = "Programador";
			
			
			Conta conta = new Conta();
			conta.deposita(100);
			
			conta.titular = paulo;
			
			System.out.println("Nome do Titular: " + conta.titular.nome);
			System.out.println("CPF: " + conta.titular.cpf);
			System.out.println("Profissão: " + conta.titular.profissao);
		
			
	}

}
