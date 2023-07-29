package myBank_heranca;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Gerente: Roberto");
		gerente.setSalario(5000.0);
		String nome = gerente.getNome();
		System.out.println(nome);
		
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(gerente);
		controle.registro(editor);
		controle.registro(designer);
		
		
		System.out.println(controle.getSoma());
	}

}
  