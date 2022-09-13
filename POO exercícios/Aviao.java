package POOexercicios;

public class Aviao {
	
	/*
	2) Crie uma classe avião e apresente os atributos e métodos referentes a esta classe,
	em seguida crie um objeto avião, defina as instancias deste objeto e
	apresente as informações deste objeto no console.
	 */
	
	//declaração dos atributos da classe
	
			private String modelo;
			private int ano;
			private int capacidade;
			
			public Aviao(String modelo,int ano, int capacidade) {
				
				this.modelo = modelo;
				this.ano = ano;
				this.capacidade = capacidade;
			}
			
			//declaração dos demais métodos da classe

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
				System.out.println("Modelo: "+modelo+"\nAno: "+ano+"\nCapacidade máxima: "+capacidade+" pessoas");
			}
				
			

}
