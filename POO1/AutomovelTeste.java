package POO1;

public class AutomovelTeste {

	public static void main(String[] args) {

		//instanciar a minha classe Automovel
		
				Automovel auto1 = new Automovel("Roberta Ribeiro","Mini Cooper","DEV2022",2022);
				Automovel auto2 = new Automovel("Camilla Villares","Porch","CAM2022",2022);
				
				auto1.imprimirInfo();
				System.out.println("*****************TRANSFERÊNCIA DE PROPRIETÁRIA****************");
				auto1.setNomeProprietario("Cecília");
				auto1.imprimirInfo();
				System.out.println("\n");
				
				auto2.imprimirInfo();
				System.out.println("*****************ALTERAÇÃO DE PLACA****************");
				auto2.setPlaca("CAM2E22");
				auto2.imprimirInfo();

			}

		}