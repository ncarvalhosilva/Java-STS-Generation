package POOherancaExemplo;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Empregado emp = new Empregado("Juliana Cruz","Rua da Marola,99","53050434567",948484848,
				20,122,5000,30);
		
		emp.imprimirInfo();
		emp.calcularSalario();

	}

}