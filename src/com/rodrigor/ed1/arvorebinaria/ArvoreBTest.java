package com.rodrigor.ed1.arvorebinaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArvoreBTest {

	@Test
	public void testContem() {
		ArvoreB arvore = new ArvoreB();
		assertFalse(arvore.contem("algumaCoisa"));
		arvore.inserir("d");
		assertTrue(arvore.contem("d"));
		arvore.inserir("a");
		assertTrue(arvore.contem("a"));
		arvore.inserir("b");
		assertTrue(arvore.contem("b"));
		arvore.inserir("c");
		assertTrue(arvore.contem("c"));
		assertFalse(arvore.contem("z"));
	}
	
	@Test
	public void testRemoverElementoSemFilhos(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("b");
		arvore.inserir("a");		
		arvore.inserir("c");
		assertEquals("abc",arvore.toString());
		arvore.remover("a");
		assertEquals("bc",arvore.toString());
		arvore.remover("c");
		assertEquals("b",arvore.toString());
		arvore.remover("b");
		assertTrue(arvore.vazia());
	}
	
	@Test
	public void testRemoverElementoFilhoDireita(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("a");
		arvore.inserir("b");		
		arvore.inserir("c");
		arvore.inserir("d");
		assertEquals("abcd",arvore.toString());
		arvore.remover("c");
		assertEquals("abd",arvore.toString());
		arvore.remover("b");
		assertEquals("ad",arvore.toString());
		arvore.remover("a");
		assertEquals("d",arvore.toString());
		arvore.remover("d");
		assertTrue(arvore.vazia());
		
	}
	
	@Test
	public void testRemoverElementoFilhoEsquerda(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("d");
		arvore.inserir("c");		
		arvore.inserir("b");
		arvore.inserir("a");
		assertEquals("abcd",arvore.toString());
		arvore.remover("b");
		assertEquals("acd",arvore.toString());
		arvore.remover("c");
		assertEquals("ad",arvore.toString());
		arvore.remover("d");
		assertEquals("a",arvore.toString());
		arvore.remover("a");
		assertTrue(arvore.vazia());
	}
	
	@Test
	public void testRemoverElementoDoisFilhos_Caso1(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("b");
		arvore.inserir("a");
		arvore.inserir("c");
		assertEquals("abc",arvore.toString());
		arvore.remover("b");
		assertEquals("ac",arvore.toString());
		arvore.remover("a");
		assertEquals("c",arvore.toString());
		arvore.remover("c");
		assertTrue(arvore.vazia());
	}
		
	@Test
	public void testRemoverElementoDoisFilhos_Caso2(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("e");
		arvore.inserir("b");
		arvore.inserir("a");		
		arvore.inserir("c");
		arvore.inserir("d");
		assertEquals("abcde",arvore.toString());
		arvore.remover("b");
		assertEquals("acde",arvore.toString());
		arvore.remover("e");
		assertEquals("acd",arvore.toString());
		arvore.remover("d");
		arvore.remover("c");
		arvore.remover("a");
		assertTrue(arvore.vazia());		
	}

	@Test
	public void testRemoverElementoDoisFilhos_Caso3(){
		ArvoreB arvore = new ArvoreB();
		arvore.inserir("e");
		arvore.inserir("i");
		arvore.inserir("f");		
		arvore.inserir("g");
		arvore.inserir("h");
		arvore.inserir("k");
		arvore.inserir("j");
		arvore.inserir("l");
		assertEquals("efghijkl",arvore.toString());
		arvore.remover("i");
		assertEquals("efghjkl",arvore.toString());
		arvore.remover("h");
		arvore.remover("g");
		arvore.remover("f");
		arvore.remover("k");
		arvore.remover("l");
		arvore.remover("j");
		arvore.remover("e");
		assertTrue(arvore.vazia());
	}

	
}
