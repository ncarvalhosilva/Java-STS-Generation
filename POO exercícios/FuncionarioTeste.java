package POOexercicios;

public class FuncionarioTeste {

	public static void main(String[] args) {


		Funcionario func1 = new Funcionario("Nayara","Desenvolvedora Full-Stack Jr.",2022,4000);
		Funcionario func2 = new Funcionario("Adam","Desenvolvedor Full-Stack Jr.",2022,4000);
		
		System.out.println("** FUNCIONÁRIOS **\n");
		func1.imprimirInfo();
		System.out.println("\n");
		func2.imprimirInfo();

	}

}
