package myCar;

public class Program {

	public static void main(String[] args) {
		Carro carro = new Carro(2013, "Gol", 35000.0);
		Carro outroCarro = new Carro("Civic", 95000.0);
		
		System.out.println(carro.getAno() +" "+ carro.getModelo() +" "+ carro.getPreco());
		System.out.println(outroCarro.getModelo() +" "+ outroCarro.getPreco());
		
	}

}
