package POOheranca;

public class Cavalo extends Animal {
	
	public Cavalo(String nome,int idade,String som) {
		
		super(nome,idade,som);
		
	}

	public void movimentoCav() {
		System.out.println("\neste animal corre");
	}
	
	
}