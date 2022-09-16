package POOcollections;


import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n...............................................................");
			System.out.println("\t\tESTOQUE LOJA ARUANDA");
			System.out.println("...............................................................");
			System.out.println("\n(1) Adicionar produtos no estoque");
			System.out.println("\n(2) Remover produtos do estoque");
			System.out.println("\n(3) Atualizar produtos do estoque");
			System.out.println("\n(4) Mostrar produtos do estoque");
			System.out.println("\n(0) Encerrar o programa");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			System.out.println("\n...............................................................");
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nInsira um novo produto ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nInsira o produto que gostaria de remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
					
				}else {
					System.out.println("\n-- PRODUTO NÃO ENCONTRADO --");
				}
				System.out.println("\nEstoque atualizado: "+estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nInsira o produto que gostaria de atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nAtualize o produto "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
					
				}else {
					System.out.println("\n-- PRODUTO NÃO ENCONTRADO --");
				}
				System.out.println("\nEstoque atualizado: "+estoque);
				break;
			case 4:
				System.out.println("\nEstoque atual: "+estoque);
				break;
			case 0:
				System.out.println("\nObrigada por utilizar nosso sistema!");
				break;
				default:
					System.out.println("\n-- OPÇÃO INVÁLIDA --");
			}
			
		}
		while(op!=0);
	}

}