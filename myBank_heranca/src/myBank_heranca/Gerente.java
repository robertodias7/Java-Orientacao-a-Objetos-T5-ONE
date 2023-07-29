package myBank_heranca;
//Gerente herda atributos e métodos da classe FuncionárioAutenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
	
		this.autenticador = new AutenticacaoUtil();
	}

	
	//Reescrita de assinatura - Esse é o mesmo método que tem na classe mãe
	public double getBonificacao() {
		System.out.println("Gerente");
		return  super.getSalario();
		//Super significa que o atributo não está definido
		//nessa classe e sim na classe mãe
	}
	

	@Override
	public void setSenha(int senha) {
			this.autenticador.setSenha(senha);
		}
		
	

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
