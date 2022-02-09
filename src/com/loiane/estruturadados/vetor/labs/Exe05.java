package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exe05 {
	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		lista.limpar();
		System.out.println(lista);

	}
}
