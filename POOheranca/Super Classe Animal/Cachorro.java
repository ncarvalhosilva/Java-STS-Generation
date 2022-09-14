package POOheranca;

public class Cachorro extends Animal {
	
	public Cachorro(String nome,int idade) {
		
		super(nome,idade);
				
	}

	public void movimentoCach() {
		System.out.println("Este animal corre");
	}
	
	public void somCach() {
		System.out.println("\nEste animal late");
	}
	
	
}