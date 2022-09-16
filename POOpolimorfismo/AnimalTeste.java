package POOpolimorfismo;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Toddy",2);
		Cavalo cavalo1 = new Cavalo("Lua Negra",5);
		Preguica preguica1 = new Preguica("Betty",3);
		
		cachorro1.imprimirInfo();
		cachorro1.movimento();
		cachorro1.som();
		
		System.out.println("\n");
		
		cavalo1.imprimirInfo();
		cavalo1.movimento();
		cavalo1.som();
		
		System.out.println("\n");
		
		preguica1.imprimirInfo();
		preguica1.movimento();
		preguica1.som();
		
	}
	
	
}