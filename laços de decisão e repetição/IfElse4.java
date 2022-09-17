package familia58;

import java.util.Scanner;

public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um programa que entre com três números e coloque em ordem crescente.
		
		 POSSIBILIDADES:
		 MENOR  MEIO  MAIOR
		 A      B     C
		 A      C     B
		 B      A     C
		 B      C     A
		 C      A     B
		 C      B     A
		 */
		
		double A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o 1º número: ");
		A = leia.nextDouble();
		System.out.println("\nInsira o 2º número: ");
		B = leia.nextDouble();
		System.out.println("\nInsira o 3º número: ");
		C = leia.nextDouble();

		if(A<=B && B<=C) {
			System.out.println("\nEm ordem crescente: "+A+" , "+B+" e "+C);
		}else if(A<=C && C<=B) {
			System.out.println("\nEm ordem crescente: "+A+" , "+C+" e "+B);
		}else if(B<=A && A<=C) {
			System.out.println("\nEm ordem crescente: "+B+" , "+A+" e "+C);
		}else if(B<=C && C<=A) {
			System.out.println("\nEm ordem crescente: "+B+" , "+C+" e "+A);
		}else if(C<=A && A<=B) {
			System.out.println("\nEm ordem crescente: "+C+" , "+A+" e "+B);
		}else {
			System.out.println("\nEm ordem crescente: "+C+" , "+B+" e "+A);
		}
		
	}

}
