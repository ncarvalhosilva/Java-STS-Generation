package POOpolimorfismo;

public class Preguica extends Animal implements AnimalInter {
	
	public Preguica(String nome,int idade) {
		
		super(nome,idade);
		
	}

	@Override
	public void movimento() {
		System.out.println("\nEste animal sobe em árvores");
	}
	
	@Override
	public void som() {
		System.out.println("Este animal quando ameaçado, emite som de alta-frequência pelas narinas");
	}
	
	
}