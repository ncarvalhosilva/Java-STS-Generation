package familia58;

import java.util.Scanner;

public class IfElsePlataforma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		System.out.printf("Entre com o seu nome: ");
		nome = leia.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		if(idade>=18) {
			System.out.printf("\nVoc� � maior de idade.");
		}else if(idade>=1 && idade<18) {
			System.out.printf("\nVoc� � menor de idade.");
		}else {
			System.out.printf("\nVoc� entrou com uma idade inv�lida! Tente novamente.");
		}

	}

}
