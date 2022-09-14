package POOheranca;

public class Cachorro extends Animal {
	
	public Cachorro(String nome,int idade,String som) {
		
		super(nome,idade,som);
		
	}

	public void movimentoCach() {
		System.out.println("\neste animal corre");
	}
	
	
}
