package POO1;

public class EmpregadoTeste {

	public static void main(String[] args) {

Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Let�cia Santos",25000);
		lista[1] = new Empregado("Hellen Digramont",15000);
		lista[2] = new Empregado("Isabel Soares",45750);
		
		for(Empregado roda:lista) {//criei um la�o de repeti��o para rodar a classe Empregado
			//com uma vari�vel de loop chamada roda e vai imprir as informa��es dos Empregados
			//da primeira posi��o at� a �ltima posi��o da minha lista
			
			roda.imprimir();
		}
		
		System.out.println("\n**************** ATUALIZA��O SALARIAL ****************");
		for(Empregado roda:lista) {
			roda.aumentarSalario(20);
			roda.imprimir();
		}

	}

}