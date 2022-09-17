package familia58;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		 int[][] numero = new int[2][3];
	        int somaNumero = 0, linha, coluna;

	        Scanner ler = new Scanner(System.in);

	        for (linha = 0; linha < 2; linha++) {

	            for (coluna = 0; coluna < 3; coluna++) {

	                System.out.println("Entre com um número: ");
	                numero[linha][coluna] = ler.nextInt();

	                if (numero[linha][coluna] > 0) {
	                    somaNumero += numero[linha][coluna];
	                }

	            }
	        }

	        System.out.println("\nO somatório dos numeros é " + somaNumero);
	    }

	}
