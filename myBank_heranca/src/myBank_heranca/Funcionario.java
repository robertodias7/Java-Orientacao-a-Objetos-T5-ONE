package myBank_heranca;
//Não pode instanciar dessa classe porque é abstrata, representa um conceito
public abstract class Funcionario {
	//private deixa os atributos acessíveis somente dentro da Class
	private String nome;
	private String cpf;
	//protected deixa os atributos acessíveis para as classes filhas
	protected double salario;
	private int tipo = 0;
	
	//Método sem corpo, não há implementação
	public abstract double getBonificacao();//Também existe método abstrato
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
