package familia58;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		/*
		3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		*/
		
		 int numeros,contPar=0,contImpar=0;
	        
	        Scanner ler = new Scanner(System.in);
	        
	        System.out.println("\nEntre com um n�mero: ");
	        numeros = ler.nextInt();
	        
	        while(numeros!= -99) {
	            if(numeros % 2 == 0) {
	                contPar++;
	            }else {
	                contImpar++;
	            }
	            System.out.println("\nEntre com um n�mero: ");
	            numeros = ler.nextInt();
	        }
	        System.out.println("\nN�s temos: "+contPar+" n�meros pares");
	        System.out.println("\nN�s temos: "+contImpar+" n�meros �mpares");
	    }

	}