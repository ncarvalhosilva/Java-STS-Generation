package familia58;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		
		/*
		 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
		 */
		
		  float numeros, somaNumero=0,media;
	        int contNumeros=0;
	        
	        Scanner leia = new Scanner(System.in);
	        
	        System.out.println("\nEntre com um número: ");
	        numeros = leia.nextFloat();
	        
	        do {
	            
	            if(numeros == 0) {
	                System.out.println("\nSair do loop");
	            }else {
	                if(numeros > 0) {
	                    somaNumero += numeros;
	                    contNumeros++;
	                }
	                System.out.println("\nEntre com um número: ");
	                numeros = leia.nextFloat();
	            }
	            
	            
	        }while(numeros != 0);
	        
	        if(contNumeros == 0) {
	            System.out.println("\nNão é possível fazer divisão por zero!");
	        }else {
	            media = somaNumero / contNumeros;
	            System.out.printf("\nMédia dos números é: %.2f",media);
	            
	        }        
	        
	    }

	}