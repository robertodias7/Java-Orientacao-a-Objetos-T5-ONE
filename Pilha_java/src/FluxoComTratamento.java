
public class FluxoComTratamento {
	
	public static void main(String[] args) {
		System.out.println("ini do main");
		try {
			metodo1();
		
		}catch (ArithmeticException | NullPointerException ex) {
			
			String msg = ex.getMessage();
			System.out.println("Exeption" + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
		private static void metodo1() {
			System.out.println("ini do método1");
			metodo2();
			System.out.println("Fim do método1");
		}
		
		private static void metodo2() {
			System.out.println("ini do método2");
			throw new ArithmeticException("Deu errado");
		}
}
