package familia58;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		 float media[] = new float[3];
	        float n1,n2,n3,somaMedia=0,mediaGeral;
	        int x;
	        
	        Scanner leia = new Scanner(System.in);
	        
	        for(x=0;x<3;x++) {
	            System.out.println("\nEntre com a 1� nota: ");
	            n1= leia.nextFloat();
	            System.out.println("\nEntre com a 2� nota: ");
	            n2= leia.nextFloat();
	            System.out.println("\nEntre com a 3� nota: ");
	            n3= leia.nextFloat();
	            
	            media[x] = (n1+n2+n3)/3;
	            System.out.printf("\nM�dia aritm�tica �: %.2f", media[x]);
	            somaMedia += media[x];
	        }
	        mediaGeral = somaMedia / 3;
	        System.out.printf("\nM�dia Geral: %.2f", mediaGeral);
	    }

	}