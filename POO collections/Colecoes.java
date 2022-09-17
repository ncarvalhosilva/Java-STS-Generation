package POOcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Colecoes {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();//estou criando um objeto do tipo list
		//e estou instanciando este objeto do tipo ArrayList
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(7);
		
		for(Integer listaElementos:minhaLista) {
			
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		minhaLista.remove(0);//remove um elemento da lista a partir do seu índice
		
		for(Integer listaElementos:minhaLista) {
			
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);//serve para pegar um elemento a partir do seu índice
		System.out.println("\nO primeiro elemento foi: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {//o método size serve para pegar o tamanho da minha coleção
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);//o método sort ele vai ordenar o meu ArrayList chamado minhaLista
		System.out.println("\nDepois de ordenada...");
		System.out.println(minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		meuSet.add(5);
		//Iterator é uma API que serve para percorrer as interfaces derivados das collections
		//Além de percorrer ele vai poder remover, atualizar ou mesmo gerenciar toda a lista de elementos
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {//estou percorrendo o meu iMeuSet e vou verificando cada elemento
			//para saber se já chegou no fim da minha coleção 
			System.out.println(iMeuSet.next());//o next vai imprimir sempre o próximo elemento, não precisando passar qual é o seu índice
		}
		
	}

}