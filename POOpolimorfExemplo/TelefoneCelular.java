package POOpolimorfExemplo;

public class TelefoneCelular extends Telefone{//estou criando uma herança com o telefone
	
	public TelefoneCelular() {//criação do construtor e passando o tipo de Telefone
		super("Celular");
	}

	@Override // estou criando uma sobrescrita do meu método abstrato toca
	public void toca(int codigoToque) {//implementando o método abstrato toca da minha classe abstrata Telefone
		switch(codigoToque) {
		case 1:
			System.out.println("Trimmm...trimmmm");
			break;
		case 2:
			System.out.println("Plinnn...plinnn");
			break;
			default:
				System.out.println("Trummm...trummm");
		}
	}
	
	@Override
	public void disca(String numero) {
		
		System.out.println("\nO número: "+numero+" é um celular...");
	}
}