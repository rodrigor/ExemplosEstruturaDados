package com.rodrigor.ed1.arvorebinaria;

public class NoArvore {
	
	private String valor;
	private NoArvore dir, esq, pai;
	
	
	public NoArvore(String valor){
		this(valor,null);
	}
	public NoArvore(String valor, NoArvore pai){
		this.valor = valor;
		this.pai = pai;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public NoArvore getDir() {
		return dir;
	}

	public void setDir(NoArvore dir) {
		this.dir = dir;
	}

	public NoArvore getEsq() {
		return esq;
	}

	public void setEsq(NoArvore esq) {
		this.esq = esq;
	}

	public NoArvore getPai() {
		return pai;
	}

	public void setPai(NoArvore pai) {
		this.pai = pai;
	}
	
	public int compareTo(NoArvore no){
		return this.valor.compareTo(no.valor);
	}

}
