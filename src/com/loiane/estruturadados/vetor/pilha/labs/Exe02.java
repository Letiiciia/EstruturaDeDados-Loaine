package com.loiane.estruturadados.vetor.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exe02 {
	public static void main(String[] args) {
		Stack<Integer> par = new Stack<>();
		Stack<Integer> impar = new Stack<>();

		Scanner scan = new Scanner(System.in);
		int numero;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			if (numero == 0) {
				if (par.isEmpty()) {
					System.out.println("Stack par esta vazia");
				}
				if (impar.isEmpty()) {
					System.out.println("Stack impar esta vazia");
				}
				par.pop();
				impar.pop();
			} else if (numero % 2 == 0) {
				par.add(numero);
			} else if (numero % 2 != 0) {
				impar.add(numero);

			}
			

		}
		
		while (!par.isEmpty()) {
			System.out.println(par.pop());	
		}
		while (!impar.isEmpty()) {
			System.out.println(impar.pop());
		}
		System.out.println(par);
		System.out.println(impar);
		
	}
}
