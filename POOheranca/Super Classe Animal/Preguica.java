package POOheranca;

public class Preguica extends Animal {
	
	public Preguica(String nome,int idade) {
		
		super(nome,idade);
		
	}

	public void movimentoPreg() {
		System.out.println("Este animal sobe em �rvores");
	}
	
	public void somPreg() {
		System.out.println("\nEste animal quando amea�ado, emite sons de alta-frequ�ncia pelas narinas");
	}
	
	
}