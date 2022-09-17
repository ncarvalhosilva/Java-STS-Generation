package POOpolimorfExemplo;

public class TelefonePublico extends Telefone{
	
	public TelefonePublico() {
		super("Público");
	}
	
	@Override
	public void toca(int numToques) {
		
		for(int i=0;i<numToques;i++) {
			System.out.println("\nPiririnpiririnnn...");
		}
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8') {//o método charAt vai fazer a busca de um caracter específico dentro de uma string
			System.out.println("\nEste telefone não liga para celular!!!");
		}
		else {
			System.out.println("\nDiscando: "+numero);
		}
	}

}