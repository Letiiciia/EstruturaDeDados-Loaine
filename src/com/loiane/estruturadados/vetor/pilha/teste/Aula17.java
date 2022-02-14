package com.loiane.estruturadados.vetor.pilha.teste;

import com.loiane.estruturadados.vetor.Pilha;

public class Aula17 {
	
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();
		
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		
		System.out.println(pilha);
		System.out.println("Desempilhando elemento " + pilha.desempilha());
		System.out.println(pilha);
	}

}
