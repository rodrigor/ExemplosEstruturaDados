package com.rodrigor.ed1.listaencadeadadupla;

public class ListaDuplamenteEncadeada {

	private NoDuplo cabeca;
	private NoDuplo calda;
	
	private int size;
	
	public ListaDuplamenteEncadeada(){
		this.size = 0;
	}
	
	public void addInicio(String valor){
		NoDuplo novo = new NoDuplo(valor);
		
		if(cabeca == null){
			cabeca = novo;
			calda = novo;
			return;
		}
		
		novo.setProximo(cabeca);
		cabeca.setAnterior(novo);
		cabeca = novo;
		size++;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("[");
		NoDuplo aux = cabeca;
		while(aux != null){
			str.append(aux.getValor());
			if(aux.getProximo() != null)
				str.append(",");
			aux = aux.getProximo();
		}
		str.append("]");
		return str.toString();
	}

}
