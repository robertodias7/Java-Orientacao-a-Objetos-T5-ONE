package myBank_heranca;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Roberto");
		gerente.setCpf("222.222.222-22");
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autentica = gerente.autentica(2222);
		System.out.println(autentica);
		
		System.out.println(gerente.getBonificacao());
	}

}
