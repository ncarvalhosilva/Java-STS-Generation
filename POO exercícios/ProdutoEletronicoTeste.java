package POOexercicios;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
		ProdutoEletronico prod1 = new ProdutoEletronico("Notebook",354930,15,2000);
		ProdutoEletronico prod2 = new ProdutoEletronico("Tablet",354932,25,1500);
		ProdutoEletronico prod3 = new ProdutoEletronico("Celular",354933,50,2500);
		
		System.out.println("** PRODUTOS ELETRÔNICOS **\n");
		prod1.imprimirInfo();
		System.out.println("\n");
		prod2.imprimirInfo();
		System.out.println("\n");
		prod3.imprimirInfo();
		

	}

}
