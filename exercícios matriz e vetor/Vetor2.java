package familia58;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		
		/*
		 Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.
		*/
		
		  float[] vetor = new float[6];
	        int contPar=0, somaPar = 0, contImpar=0,x;

	        Scanner leia = new Scanner(System.in);

	        for(x=0;x<6;x++) {
	            System.out.println("Digite um n�mero: ");
	            vetor[x] = leia.nextInt();

	            if (vetor[x] % 2 == 0) {
	                contPar++;
	                somaPar += vetor[x];
	            }else {
	                contImpar++;
	            }


	        }
	        System.out.println("Pares digitados: ");
	        for (x=0;x<6;x++) {
	            if(vetor[x] % 2 == 0) {
	                System.out.println(vetor[x]);
	            }
	        }
	            System.out.println("�mpares digitados: ");
	            for(x=0;x<6;x++) {
	            if (vetor[x] % 2 != 0) {
	                System.out.println(vetor[x]);
	            }

	        }
	            System.out.println("\nFoi digitado "+contPar+" n�meros pares.");
	            System.out.println("\nA soma dos n�meros pares digitado �: "+somaPar);
	            System.out.println("\nFoi digitado "+contImpar+" n�meros �mpares.");



	    }
	}