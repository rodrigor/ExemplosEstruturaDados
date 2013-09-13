package com.rodrigor.ed1.vetorarray;

import com.rodrigor.ed1.iterator.Iterador;

public class ListaVetor {
	
	
	private Object[] elementos;
	private final int TAM_INICIAL = 10;
	private int size;
	
	public ListaVetor(){
		this.elementos = new Object[TAM_INICIAL];
		size = 0;
	}
	
	
	public Iterador getIterador(){
		return new IteradorListaVetor(elementos, size);
	}

}
