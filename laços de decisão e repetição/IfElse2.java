package familia58;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que receba tr�s n�meros inteiros e diga qual deles � o maior.
		
		int num1,num2,num3,maiorNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o 1� n�mero inteiro: ");
		num1 = leia.nextInt();
		System.out.println("Insira o 2� n�mero inteiro: ");
		num2 = leia.nextInt();
		System.out.println("Insira o 3� n�mero inteiro: ");
		num3 = leia.nextInt();
		
		if(num1>=num2 && num1>=num3){
			maiorNum = num1;
		}else if(num2>=num1 && num2>=num3){
			maiorNum = num2;
		}else if(num3>=num1 && num3>=num2) {
			maiorNum = num3;
		}
			System.out.println("\nO maior n�mero �: "+maiorNum);
			 

	}

}
