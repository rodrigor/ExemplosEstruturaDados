package com.rodrigor.ed1.minis.m1;

public class Miniteste {

	public static void main(String[] args) {
		

		Colecao c = new Colecao(10);
		
		for(int i = 1; i <= 35; i++){
			c.add("E"+i);
		}
		
		for(int i = 0; i < c.getSize(); i++){
			System.out.println(c.getElementoAt(i));
		}

	}

}
