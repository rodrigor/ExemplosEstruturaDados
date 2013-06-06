package com.rodrigor.ed1.listaencadeadasimples;

public class ListaEncadeadaSimples {

	private No cabeca;

	private int size;

	public void add(Object o) {
		No novo = new No(o);
		size++;
		if (cabeca == null) {
			cabeca = novo;
		}else{	
			No aux = cabeca;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	/**
	 * Remove elementos da lista
	 * @param pos Posição do elemento a ser removido. Considere que o primeiro elemento está na posição 0
	 * @return valor armazenado na posição "pos"
	 */
	public Object remover(int pos) {
		if ((pos < 0) || (pos > size))
			throw new IndexOutOfBoundsException();
		this.size--;
		No removido = null;
		if (pos == 0) {
			removido = this.cabeca;
			this.cabeca = removido.getProximo();
		}else{
			No aux = this.cabeca;
			for (int i = 0; i < pos - 1; i++)
				aux = aux.getProximo();
	
			removido = aux.getProximo();
			aux.setProximo(removido.getProximo());
		}
		return removido.getValor();
	}

	public String toString() {
		No aux = cabeca;
		StringBuffer str = new StringBuffer();
		str.append("[");
		while (aux != null) {
			str.append(aux.getValor());
			if (aux.getProximo() != null)
				str.append(",");
			aux = aux.getProximo();
		}
		str.append("]");
		return str.toString();
	}

}
