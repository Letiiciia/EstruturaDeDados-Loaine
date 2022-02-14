package com.loiane.estruturadados.vetor.pilha.teste;

import com.loiane.estruturadados.vetor.Pilha;

public class Aula14 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		
		for(int i = 1; i <= 11; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
