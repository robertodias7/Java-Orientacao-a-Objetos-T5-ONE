package myBank_heranca;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método Designer");
		return 200;
	}

}
