package POO1;

import java.text.NumberFormat;

public class Empregado {
	
	private String nome;
	private double salario;
	
	public Empregado(String n, double s) {
		
		this.setNome(n);//this.nome = nome;
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {//m�todo que ir� aumentar o sal�rio
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//coloca a moeda do pa�s
		nf.setMinimumFractionDigits(2);//este m�todo indica quantas casas eu terei depois da v�rgula
		String formatoMoeda = nf.format(salario);//formatar o salario
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println("\nNome: "+nome+"\t\tSal�rio: "+this.formatarMoeda());
	}
	
	
	
	
}