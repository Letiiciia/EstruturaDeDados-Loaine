package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exe01 {
	public static void main(String[] args) {
		Lista<String> letters = new Lista<String>(3);
		
		
		letters.adiciona("A");
		letters.adiciona("B");
		letters.adiciona("C");
		letters.adiciona("D");
		letters.adiciona("E");
		
		System.out.println(letters.contem("A"));
		
	}

}
