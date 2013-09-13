package com.rodrigor.ed1.vetorarray;

import com.rodrigor.ed1.iterator.Iterador;

public class IteradorListaVetor implements Iterador {

	private int atual;
	private Object[] elementos;
	private int size;
	
	public IteradorListaVetor(Object[] elementos, int size){
		atual = 0;
		this.size = size;
		this.elementos = elementos;
	}
	
	@Override
	public boolean hasNext() {
		return atual < size;
	}

	@Override
	public Object next() {
		return elementos[atual++];
	}

}
