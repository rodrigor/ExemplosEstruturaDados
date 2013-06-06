package com.rodrigor.ed1.listaencadeadasimples;

public class No {
	
	private Object valor;
	
	private No proximo;

	public No(Object o) {
		this.setValor(o);
	}
	
	public Object getValor(){
		return this.valor;
	}
	
	public void setValor(Object o){
		this.valor = o;
	}
	
	public void setProximo(No no){
		this.proximo = no;
	}
	
	public No getProximo(){
		return this.proximo;
	}
	
	public String toString(){
		return valor.toString();
	}

}
