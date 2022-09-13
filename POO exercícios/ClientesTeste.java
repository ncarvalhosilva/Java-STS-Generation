package POOexercicios;

public class ClientesTeste {

	public static void main(String[] args) {
		
		//instanciar a minha classe Automovel
		
		Clientes cliente1 = new Clientes("Nayara","P",30);
		Clientes cliente2 = new Clientes("Adam", "G",27);
		
		System.out.println("** CADASTRO DE CLIENTES **\n");
		cliente1.imprimirInfo();
		System.out.println("\n");
		cliente2.imprimirInfo();

	}

}
