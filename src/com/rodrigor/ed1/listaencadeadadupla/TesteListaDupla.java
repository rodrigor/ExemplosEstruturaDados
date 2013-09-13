package com.rodrigor.ed1.listaencadeadadupla;

import com.rodrigor.ed1.iterator.Iterador;

public class TesteListaDupla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		lista.addInicio("1");
		lista.addInicio("2");
		lista.addInicio("3");
		Iterador it1 = lista.iterador();
		
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Iterador it2 = lista.iterador();
		while(it2.hasNext()){
			System.out.println(it1.next());
		}

	}

}
