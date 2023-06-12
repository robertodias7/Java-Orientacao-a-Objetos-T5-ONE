
public class Conta {
	
	double saldo; //Atributo
	int agencia; //Atributo
	int numero; //Atributo
	String titular; //Atributo


public void deposita(double valor) {
	this.saldo += valor;// recebe o valor do depósito e soma com o saldo
}

public boolean saca(double valor) {
	
	if(this.saldo >= valor) {// Se o saldo atual for maior ou igual ao valor do saque...
		this.saldo -= valor;// O valor do saque será subtraído e...
		return true; // retornará verdadeiro
	}
	else { // se o valor do saque for maior do que o saldo atual...
		return false;// não poderá sacar, retornará falso.
	}
}

/*O método transfere() recebe por parâmetro o valor da transferência e o destino */
public boolean transfere(double valor, Conta destino ) { 
	if(this.saldo >= valor) {// se o saldo for maior ou igual ao valor da transferência...
		this.saldo -= valor;// A transferência é autorizada
		destino.deposita(valor);// o destino recebe o método deposita() com o valor a ser depositado
		return true;
}
	return false; // Se o valor do depósito for maior do que o saldo, não autoriza a transferência.

}
}

