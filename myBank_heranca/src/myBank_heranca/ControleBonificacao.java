package myBank_heranca;

public class ControleBonificacao {
	private double soma;
	
	public void registro(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.soma += boni;
	}
	//Esse método genérico foi criado para que não haja repetições de métodos
	//E mesmo assim ele será chamado em todas classes
	

	public double getSoma() {
		return soma;
	}

	
}
