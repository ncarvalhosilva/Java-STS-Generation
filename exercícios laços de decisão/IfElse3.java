package familia58;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e
		//exiba se este n�mero � par ou �mpar.
		//Se for par exiba tamb�m a raiz quadrada do mesmo;
		//se for �mpar exiba o n�mero elevado ao quadrado.
		
		double num,numRaiz,numPot;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			System.out.println("\nO n�mero "+num+" � par");
			numRaiz = Math.sqrt(num);
			System.out.println("\nA ra�z quadrada de "+num+" �: "+numRaiz);
					
		}else {
			System.out.println("\nO n�mero "+num+" � �mpar");
			numPot = Math.pow(num, 2);
			System.out.println("\n"+num+" elevado ao quadrado �: "+numPot);
		}

	}

}
