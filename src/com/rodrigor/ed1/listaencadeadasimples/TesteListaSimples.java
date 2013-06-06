package com.rodrigor.ed1.listaencadeadasimples;

public class TesteListaSimples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		lista.add("a");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		
		System.out.println(lista);
		
		lista.remover(4);
		
		System.out.println(lista);
		


	}

}
