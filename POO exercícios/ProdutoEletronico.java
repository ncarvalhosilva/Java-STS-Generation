package POOexercicios;

public class ProdutoEletronico {
	
	/*
	3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes a esta classe,
	em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	 */
	
	private String peca;
	private int codigo;
	private int estoque;
	private float valor;
	
	public ProdutoEletronico(String peca,int codigo,int estoque,float valor) {
		
		this.peca = peca;
		this.codigo = codigo;
		this.estoque = estoque;
		this.valor = valor;
		
	}

	public String getPeca() {
		return peca;
	}

	public void setPeca(String peca) {
		this.peca = peca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void imprimirInfo() {
		System.out.println("Pe�a: "+peca+"\nC�digo: "+codigo+"\nEstoque: "+estoque+"\nValor: R$"+valor);
	
	}
}
