package POOexercicios;

public class Funcionario {
	
	/*
	4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
	 */
	
	private String nome;
	private String funcao;
	private int anoAdmissao;
	private float salario;
	
	public Funcionario(String nome,String funcao,int anoAdmissao,float salario) {
		
		this.nome = nome;
		this.funcao = funcao;
		this.anoAdmissao = anoAdmissao;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void imprimirInfo() {
		System.out.println("Funcion�rio(a): "+nome+"\nFun��o: "+funcao+"\nAdmiss�o: "+anoAdmissao+"\nSal�rio: R$"+salario);
	}

}
