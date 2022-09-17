package POOexercicios;

public class ProdutoEletronico {
	
	/*
	3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes a esta classe,
	em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto no console.
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
		System.out.println("Peça: "+peca+"\nCódigo: "+codigo+"\nEstoque: "+estoque+"\nValor: R$"+valor);
	
	}
}
