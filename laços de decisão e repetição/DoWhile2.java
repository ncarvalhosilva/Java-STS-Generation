package familia58;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros,contMult3=0,somaMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		numeros = leia.nextInt();//0
		
		do {
			
			if(numeros == 0) {
				System.out.println("\nSair do loop!!!");
			}else {
				
				if(numeros % 3 == 0) {
					somaMult3 += numeros;
					contMult3++;
				}
				System.out.println("\nEntre com um n�mero: ");
				numeros = leia.nextInt();
			}
			
		}while(numeros != 0);
		
		if(contMult3 == 0) {
			System.out.println("\nN�o podemos dividir por ZERO!!!");
		}else {
			
			media = somaMult3 / contMult3;
			System.out.printf("\nM�dia dos n�meros m�ltiplos de 3: %.2f",media);
		}

	}

}