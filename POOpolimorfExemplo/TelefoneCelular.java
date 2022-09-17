package POOpolimorfExemplo;

public class TelefoneCelular extends Telefone{//estou criando uma heran�a com o telefone
	
	public TelefoneCelular() {//cria��o do construtor e passando o tipo de Telefone
		super("Celular");
	}

	@Override // estou criando uma sobrescrita do meu m�todo abstrato toca
	public void toca(int codigoToque) {//implementando o m�todo abstrato toca da minha classe abstrata Telefone
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
		
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
}