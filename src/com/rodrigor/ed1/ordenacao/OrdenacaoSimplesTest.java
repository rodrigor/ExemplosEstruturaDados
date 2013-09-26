package com.rodrigor.ed1.ordenacao;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenacaoSimplesTest {

	@Test
	public void testBubbleSort() {
		OrdenacaoSimples ord = new OrdenacaoSimples();
		int[] vetor = {5,3,6,2,8,1};
		ord.bubbleSort(vetor);
		System.out.println(vetor);
	}

}
