package familia58;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que receba três números inteiros e diga qual deles é o maior.
		
		int num1,num2,num3,maiorNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o 1º número inteiro: ");
		num1 = leia.nextInt();
		System.out.println("Insira o 2º número inteiro: ");
		num2 = leia.nextInt();
		System.out.println("Insira o 3º número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1>=num2 && num1>=num3){
			maiorNum = num1;
		}else if(num2>=num1 && num2>=num3){
			maiorNum = num2;
		}else if(num3>=num1 && num3>=num2) {
			maiorNum = num3;
		}
			System.out.println("\nO maior número é: "+maiorNum);
			 

	}

}
