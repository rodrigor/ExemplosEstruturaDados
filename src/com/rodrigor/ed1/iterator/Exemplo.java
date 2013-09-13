package com.rodrigor.ed1.iterator;

import com.rodrigor.ed1.listaencadeadasimples.No;
import com.rodrigor.ed1.model.Aluno;

public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
		Aluno[] alunos = new Aluno[30];
		alunos[0] = new Aluno("Jose");
		alunos[1] = new Aluno("Maria");
		alunos[2] = new Aluno("João");
				
		
		
		for(int i = 0; i < alunos.length; i++){
			System.out.println(alunos[i].getNome());
		}
		
		
		
		No inicio = new No(new Aluno("Jose"));
		No maria = new No("Maria");
		inicio.setProximo(maria);
		No joao = new No("João");
		maria.setProximo(joao);
		
		
		No aux = inicio;
		while(aux != null){
			System.out.println(((Aluno)aux.getValor()).getNome());
			aux = aux.getProximo();
		}


	}

}
