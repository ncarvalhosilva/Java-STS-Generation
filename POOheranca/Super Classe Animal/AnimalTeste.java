package POOheranca;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Toddy",2,"auau");
		Cavalo cavalo1 = new Cavalo("P� de Pano",5,"pocot�");
		Preguica preguica1 = new Preguica("Betty",3,"aaaa");
		
		cachorro1.imprimirInfo();
		cachorro1.movimentoCach();
		System.out.println("\n");
		cavalo1.imprimirInfo();
		cavalo1.movimentoCav();
		System.out.println("\n");
		preguica1.imprimirInfo();
		preguica1.movimentoPreg();
		
	}
	
	
}