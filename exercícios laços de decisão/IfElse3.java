package familia58;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa em que permita a entrada de um número qualquer e
		//exiba se este número é par ou ímpar.
		//Se for par exiba também a raiz quadrada do mesmo;
		//se for ímpar exiba o número elevado ao quadrado.
		
		double num,numRaiz,numPot;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		if(num%2 == 0) {
			System.out.println("\nO número "+num+" é par");
			numRaiz = Math.sqrt(num);
			System.out.println("\nA raíz quadrada de "+num+" é: "+numRaiz);
					
		}else {
			System.out.println("\nO número "+num+" é ímpar");
			numPot = Math.pow(num, 2);
			System.out.println("\n"+num+" elevado ao quadrado é: "+numPot);
		}

	}

}
