package POOexercicios;

public class Clientes {
	
	/*
	1) Crie uma classe cliente e apresente os atributos e métodos referentes a esta classe.
	Em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.
	 */
	
	//declaração dos atributos da classe
	
			private String nomeCliente;
			private String tamanhoRoupa;
			private int idade;
			
			public Clientes(String nomeCliente,String tamanhoRoupa,int idade) {
				
				this.nomeCliente = nomeCliente;
				this.tamanhoRoupa = tamanhoRoupa;
				this.idade = idade;
			}
			
			//declaração dos demais métodos da classe

			public String getNomeCliente() {
				return nomeCliente;
			}

			public void setNomeCliente(String nomeCliente) {
				this.nomeCliente = nomeCliente;
			}

			public String getTamanhoRoupa() {
				return tamanhoRoupa;
			}

			public void setTamanhoRoupa(String tamanhoRoupa) {
				this.tamanhoRoupa = tamanhoRoupa;
			}

			public int getIdade() {
				return idade;
			}

			public void setIdade(int idade) {
				this.idade = idade;
			}
			
			public void imprimirInfo() {
				System.out.println("Nome: "+nomeCliente+"\nIdade: "+idade+"\nTamanho: "+tamanhoRoupa);

			}
			
}
