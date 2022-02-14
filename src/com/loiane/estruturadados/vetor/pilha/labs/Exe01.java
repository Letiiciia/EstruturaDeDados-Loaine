package com.loiane.estruturadados.vetor.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exe01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();
		int numero;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				stack.add(numero);
			} else if (numero % 2 != 0) {
				if (stack.isEmpty()) {
					System.out.println("Stack está vazia");
				} else {
					stack.pop();
				}
			}
		}
		
		while(!stack.isEmpty()) {
				System.out.println(stack.pop());		
			}
		
		
		System.out.println(stack);

	}

}
