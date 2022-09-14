package POOheranca;

public class Cavalo extends Animal {
	
	public Cavalo(String nome,int idade) {
		
		super(nome,idade);
		
	}

	public void movimentoCav() {
		System.out.println("Este animal corre");
	}
	
	public void somCav() {
		System.out.println("\nEste animal relincha");
	}
	
}