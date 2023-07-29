package myBank_encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Conta conta = new Conta(11, 23654);

		conta.deposita(200.0);
		System.out.println("Saldo: " + "R$ "+conta.getSaldo());
		System.out.println("Agência: " + conta.getAgencia());
		
		
		Cliente cliente = new Cliente();
		cliente.setCPF("222.222.222-22");
		cliente.setTitular("Roberto Dias");
		System.out.println("Nome do Titular: " + cliente.getTitular());
		System.out.println("CPF: " + cliente.getCPF());

		System.out.println("");

		Conta conta2 = new Conta(12, 23654);

		conta2.deposita(528.0);
		System.out.println("Saldo: " + "R$ "+conta2.getSaldo());
		System.out.println("Agência: " + conta2.getAgencia());
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setCPF("586.478.265-87");
		cliente2.setTitular("Fernando Silva");
		System.out.println("Nome do Titular: " + cliente2.getTitular());
		System.out.println("CPF: " + cliente2.getCPF());

	}
}