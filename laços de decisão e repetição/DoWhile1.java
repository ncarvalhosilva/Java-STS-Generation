package familia58;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numeros,somaNumero=0,media;
		int contNumero=0;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nEntre com um n�mero: ");
		numeros = leia.nextFloat();//0 -66
		
		do {
			
			if(numeros == 0) {
				System.out.println("\nSair do loop...");
			}else {
				if(numeros > 0) {
					somaNumero += numeros;
					contNumero++;
				}
				System.out.println("\nEntre com um n�mero: ");
				numeros = leia.nextFloat();//-9 10
			}
			
			
		}while(numeros != 0);
		
		if(contNumero == 0) {
			System.out.println("\nN�o � poss�vel fazer divis�o por zero!!!");
		}else {
		media = somaNumero / contNumero;
		System.out.printf("\nM�dia dos n�meros maiores que 0: %.2f",media);
		}
		
		
		
	}

}