package POOexercicios;

public class Aviao {
	
	/*
	2) Crie uma classe avi�o e apresente os atributos e m�todos referentes a esta classe,
	em seguida crie um objeto avi�o, defina as instancias deste objeto e
	apresente as informa��es deste objeto no console.
	 */
	
	//declara��o dos atributos da classe
	
			private String modelo;
			private int ano;
			private int capacidade;
			
			public Aviao(String modelo,int ano, int capacidade) {
				
				this.modelo = modelo;
				this.ano = ano;
				this.capacidade = capacidade;
			}
			
			//declara��o dos demais m�todos da classe

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public int getAno() {
				return ano;
			}

			public void setAno(int ano) {
				this.ano = ano;
			}

			public int getCapacidade() {
				return capacidade;
			}

			public void setCapacidade(int capacidade) {
				this.capacidade = capacidade;
			}
			
			public void imprimirInfo() {
				System.out.println("Modelo: "+modelo+"\nAno: "+ano+"\nCapacidade m�xima: "+capacidade+" pessoas");
			}
				
			

}
