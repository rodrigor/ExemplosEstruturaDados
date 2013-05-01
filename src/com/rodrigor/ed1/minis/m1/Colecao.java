package com.rodrigor.ed1.minis.m1;

public class Colecao {
	
	private String[] elementos;
	private int fim;
	private static final int INCREMENTO = 10;
	
	public Colecao(int tam) throws RuntimeException{
		if(tam < 0)
			throw new RuntimeException("Tamanho inválido: "+tam);
		this.elementos = new String[tam];
		this.fim = 0;
	}
	
	public void add(String e){
		if(fim == elementos.length)
			redimensionarArray();
		elementos[fim++] = e;
	}
	
	private void redimensionarArray(){
		String[] temp = new String[elementos.length + INCREMENTO];
		for(int i = 0; i < elementos.length; i++)
			temp[i] = elementos[i];
		elementos = temp;
	}
	
	public String getElementoAt(int pos){
		if(pos < 0 || pos > elementos.length)
			throw new RuntimeException("Posição inválida:"+pos);
		return elementos[pos];
	}
	
	public int getSize(){
		return fim;
	}

}
