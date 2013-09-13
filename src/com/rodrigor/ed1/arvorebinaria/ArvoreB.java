package com.rodrigor.ed1.arvorebinaria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArvoreB {
	
	private NoArvore raiz;
	
	public void inserir(String valor){
		NoArvore novo = new NoArvore(valor);
		if(raiz == null){
			raiz = novo;
		}else
			inserir(novo,raiz);
	}

	private void inserir(NoArvore novo, NoArvore atual){
			if(atual.compareTo(novo) >= 0)
				if(atual.getDir() == null){
					novo.setPai(atual);
					atual.setDir(novo);
				}else{
					inserir(novo,atual.getDir());
				}
			else
				if(atual.getEsq() == null){
					novo.setPai(atual);
					atual.setEsq(novo);
				}else{
					inserir(novo,atual.getEsq());
				}
	}
	
	public boolean contem(String valor){
		if(raiz == null) return false;
		return existe(valor,raiz);
	}
	
	private boolean existe(String valor, NoArvore atual){
		if(atual == null) return false;
		if(atual.getValor().equals(valor)) return true;
		if(atual.getValor().compareTo(valor) > 0)
			return existe(valor,atual.getDir());
		return existe(valor,atual.getEsq());
	}
	
	public String toString(){
		return toString(raiz);
	}
	
	private String toString(NoArvore atual){
		if(atual == null) return "";
		StringBuilder str = new StringBuilder();		
		str.append(toString(atual.getDir()));
		str.append(atual.getValor());
		str.append(toString(atual.getEsq()));
		return str.toString();
	}

	public boolean vazia(){
		return raiz == null;
	}
	
	public String remover(String valor){
		return remover(valor,raiz);
	}
	
	private String remover(String valor, NoArvore atual){
		if(atual == null)
			return null;
		
		if(atual.getValor().compareTo(valor) < 0)
			return remover(valor,atual.getEsq());

		if(atual.getValor().compareTo(valor) > 0) 
			return remover(valor,atual.getDir());

		/* achou o elemento */
		
		// caso 1: se não tem filhos:
		if(atual.getEsq() == null && atual.getDir() == null){
			substituirAtualPor(atual,null);
			return atual.getValor();
		}
		
		// caso 2: tem filhos só à direita
		if(atual.getEsq() == null){
			substituirAtualPor(atual,atual.getDir());
			return atual.getValor();
		}
		
		// caso 3: tem filhos só à esquerda
		if(atual.getDir() == null){
			substituirAtualPor(atual,atual.getEsq());
			return atual.getValor();
		}
		
		// caso 4: tem filhos à esquerda e à direita
		NoArvore tmp = atual.getEsq();
		while(tmp.getDir() != null){
			tmp = tmp.getDir();
		}
		atual.setValor(tmp.getValor());
		tmp.setValor(valor);
		
		return remover(valor,atual.getEsq());
	}

	private void substituirAtualPor(NoArvore atual, NoArvore novoFilho){
		if(novoFilho != null)
			novoFilho.setPai(atual.getPai());
		if(atual.getPai() == null)
			raiz = novoFilho;
		else if(atual == atual.getPai().getDir()){
			atual.getPai().setDir(novoFilho);

		}else if(atual == atual.getPai().getEsq())
				atual.getPai().setEsq(novoFilho);
		
		else throw new RuntimeException("Cheiro de bug! atual não é filho do seu próprio pai!");
	}

}
