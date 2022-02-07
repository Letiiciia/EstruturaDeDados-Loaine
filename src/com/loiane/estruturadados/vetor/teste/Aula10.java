package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {
	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1245-9865", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "8569-9865", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "8974-9865", "contato3@email.com");
		Contato c4 = new Contato("Contato 4", "8974-9865", "contato4@email.com");
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		vetor.adiciona(c4);
		System.out.println("Tamanho = " + vetor.tamanho());
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}
}
