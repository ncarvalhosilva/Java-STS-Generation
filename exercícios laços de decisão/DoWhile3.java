package familia58;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		
		/*
		 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
		 */
		
		  float numeros, somaNumero=0,media;
	        int contNumeros=0;
	        
	        Scanner leia = new Scanner(System.in);
	        
	        System.out.println("\nEntre com um n�mero: ");
	        numeros = leia.nextFloat();
	        
	        do {
	            
	            if(numeros == 0) {
	                System.out.println("\nSair do loop");
	            }else {
	                if(numeros > 0) {
	                    somaNumero += numeros;
	                    contNumeros++;
	                }
	                System.out.println("\nEntre com um n�mero: ");
	                numeros = leia.nextFloat();
	            }
	            
	            
	        }while(numeros != 0);
	        
	        if(contNumeros == 0) {
	            System.out.println("\nN�o � poss�vel fazer divis�o por zero!");
	        }else {
	            media = somaNumero / contNumeros;
	            System.out.printf("\nM�dia dos n�meros �: %.2f",media);
	            
	        }        
	        
	    }

	}