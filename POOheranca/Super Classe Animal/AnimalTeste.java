package POOheranca;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Toddy",2);
		Cavalo cavalo1 = new Cavalo("Pé de Pano",5);
		Preguica preguica1 = new Preguica("Betty",3);
		
		cachorro1.imprimirInfo();
		cachorro1.somCach();
		cachorro1.movimentoCach();
		System.out.println("\n");
		cavalo1.imprimirInfo();
		cavalo1.somCav();
		cavalo1.movimentoCav();
		System.out.println("\n");
		preguica1.imprimirInfo();
		preguica1.somPreg();
		preguica1.movimentoPreg();
		
	}
	
	
}