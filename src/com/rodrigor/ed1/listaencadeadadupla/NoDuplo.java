package com.rodrigor.ed1.listaencadeadadupla;

public class NoDuplo {
	
	private NoDuplo proximo, anterior;
	private String valor;
	
	
	public NoDuplo(String valor){
		this.valor = valor;
	}
	
	public void setProximo(NoDuplo no){
		this.proximo = no;
	}
	
	public void setAnterior(NoDuplo no){
		this.anterior = no;
	}
	
	public NoDuplo getProximo(){
		return this.proximo;
	}
	
	public NoDuplo getAnterior(){
		return this.anterior;
	}

	public Object getValor() {
		return valor;
	}
	
	public String toString(){
		return valor.toString();
	}

}
