package com.rodrigor.ed1.ordenacao;

public class OrdenacaoSimples {

	public long bubbleSort(int[] num) {
		long before = System.currentTimeMillis();
		for(int i=0; i < num.length; i++){
			for(int j=i+1; j < num.length; j++){
				if(num[i] > num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		return System.currentTimeMillis() - before;
	}
	
	public long selectionSort(int[] num){
		long before = System.currentTimeMillis();
		int min;
		for(int i=0; i < (num.length - 1); i++){
			min = i;
			for(int j = i+1; j < num.length; j++){
				if(num[j] < num[min])
					min = j;
			}
			int tmp = num[min];
			num[min] = num[i];
			num[i] = tmp;
		}
		return System.currentTimeMillis() - before;
		
	}
	
	public long insertionSort(int[] num){
		long before = System.currentTimeMillis();
		int atual;
		for(int i = 1; i < num.length; i++){
			atual = num[i];
			int j = i;
			while ((j > 0) && (num[j-1] > atual)){
				num[j] = num[j-1];
				j = j-1;
			}
			num[j] = atual;
		}
		
		return System.currentTimeMillis() - before;
	}


	public static void main(String[] args) {
		OrdenacaoSimples ord = new OrdenacaoSimples();
		int[] vetor = { 5, 3, 6, 2, 8, 1 };
		System.out.println("BubbleSort:"+ord.bubbleSort(vetor));
		print(vetor);
		
		int[] vetor2 = { 5, 3, 6, 2, 8, 1 };
		System.out.println("SelectionSort:"+ord.selectionSort(vetor2));
		print(vetor2);

		int[] vetor3 = { 5, 3, 6, 2, 8, 1 };
		System.out.println("InsertionSort:"+ord.insertionSort(vetor3));
		print(vetor3);
	}

	private static void print(int[] vetor) {
		System.out.print("[");
		for(int i = 0; i < vetor.length; i++)
			System.out.print(vetor[i]+((i+1 == vetor.length)?"":","));
		System.out.println("]");
	}

}
