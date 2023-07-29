package myBank_heranca;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente roberto = new Gerente();
		
		roberto.setNome("Roberto Dias");
		roberto.setCpf("222.222.222-33");
		roberto.setSalario(2600.00);
		
		System.out.println(roberto.getNome());
		System.out.println(roberto.getCpf());
		System.out.println(roberto.getBonificacao());
	}
}
