package POOexercicios;

public class AviaoTeste {

	public static void main(String[] args) {

		//instanciar a minha classe Automovel
		
		Aviao av1 = new Aviao("Boeing 737-100",2020,100);
		Aviao av2 = new Aviao("Boeing 737-200",2020,115);
		
		System.out.println("** CADASTRO DE AVIÕES **\n");
		av1.imprimirInfo();
		System.out.println("\n");
		av2.imprimirInfo();

	}

}
