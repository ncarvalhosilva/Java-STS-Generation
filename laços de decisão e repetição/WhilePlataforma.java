package familia58;

import java.util.Scanner;

public class WhilePlataforma {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1)
		{
			System.out.printf("Sua idade: %d",idade);
			if(idade>=18)
			{
				System.out.printf("\nVoc� � maior de idade.");
			}else {
				System.out.printf("\nVoc� �menor de idade.");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		}

	}

}
