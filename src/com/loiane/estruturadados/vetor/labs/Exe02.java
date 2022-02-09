package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.List;

import com.loiane.estruturadados.vetor.Lista;

public class Exe02 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		System.out.println(lista.lastIndexOf("B"));
//		
//		Lista<String> lista = new Lista<String>(5);
//		lista.adiciona("A");
//		lista.adiciona("B");
//		lista.adiciona("C");
//		
//		System.out.println(lista.ultimoIndice("C"));
		
	}

}
