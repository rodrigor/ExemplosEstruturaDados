package com.rodrigor.ed1.listaencadeadadupla;

import com.rodrigor.ed1.iterator.Iterador;


public class IteradorListaDuplamenteEncadeada implements Iterador{
	
	private NoDuplo atual;
	
	public IteradorListaDuplamenteEncadeada(NoDuplo cabeca){
		this.atual = cabeca;
	}

	@Override
	public boolean hasNext() {
		return atual != null;
	}

	@Override
	public Object next() {
		if(!hasNext())
			throw new RuntimeException("Não existe próximo elemento!");
		NoDuplo aux = atual;
		atual = atual.getProximo();
		return aux.getValor();
	}

}
