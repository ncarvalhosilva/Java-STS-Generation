package familia58;

import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que receba a idade de uma pessoa e
		//mostre na saída em qual categoria ela se encontra:
		//10 - 14 infantil
		//15 - 17 juvenil
		//18 - 25 adulto
		//0 - 9 e >26 não tem categoria
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.println("\nSua categoria é: INFANTIL");
		}else if(idade>=15 && idade<=17) {
			System.out.println("\nSua categoria é: JUVENIL");
		}else if(idade>=18 && idade<=25) {
			System.out.println("\nSua categoria é: ADULTO");
		}else {
			System.out.println("\nSua idade não corresponde a nenhuma das categorias disponíveis no momento.");
		}
		
	}

}
