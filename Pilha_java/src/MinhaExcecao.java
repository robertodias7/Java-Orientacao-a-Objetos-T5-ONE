
public class MinhaExcecao extends Exception {//checked

public MinhaExcecao(String msg) {
	super(msg);
}
	
	public static void main(String[] args) {
		System.out.println("ini do main");
		try {
			metodo1();
		
		}catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			
			String msg = ex.getMessage();
			System.out.println("Exeption" + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
		private static void metodo1()throws MinhaExcecao {
			System.out.println("ini do método1");
			metodo2();
			System.out.println("Fim do método1");
		}
		
		private static void metodo2() throws MinhaExcecao {
			System.out.println("ini do método2");
			throw new MinhaExcecao("Deu muito errado");
		}
}



