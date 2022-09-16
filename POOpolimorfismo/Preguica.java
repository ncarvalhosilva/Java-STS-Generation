package POOpolimorfismo;

public class Preguica extends Animal implements AnimalInter {
	
	public Preguica(String nome,int idade) {
		
		super(nome,idade);
		
	}

	@Override
	public void movimento() {
		System.out.println("\nEste animal sobe em �rvores");
	}
	
	@Override
	public void som() {
		System.out.println("Este animal quando amea�ado, emite som de alta-frequ�ncia pelas narinas");
	}
	
	
}