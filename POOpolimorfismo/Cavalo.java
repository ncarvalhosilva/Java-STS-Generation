package POOpolimorfismo;

public class Cavalo extends Animal implements AnimalInter {
	
	public Cavalo(String nome,int idade) {
		
		super(nome,idade);
		
	}

	@Override
	public void movimento() {
		System.out.println("\nEste animal corre");
	}
	
	@Override
	public void som() {
		System.out.println("Este animal relincha");
	}
	
	
}