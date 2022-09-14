package POOheranca;

public class Preguica extends Animal {
	
	public Preguica(String nome,int idade) {
		
		super(nome,idade);
		
	}

	public void movimentoPreg() {
		System.out.println("Este animal sobe em árvores");
	}
	
	public void somPreg() {
		System.out.println("\nEste animal quando ameaçado, emite sons de alta-frequência pelas narinas");
	}
	
	
}