package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exe06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantidade da lista de contatos ");
		int quantidadeLista = scan.nextInt();
		
		Lista<Contato> lista = new Lista<Contato>(quantidadeLista);
		
		String parada = "S";
		
		
			do{
			System.out.println("Digite um contato ");
			String nome = scan.next();
			
			System.out.println("Digite um telefone ");
			String telefone = scan.next();
			
			System.out.println("Digite um email ");
			String email = scan.next();
			
			lista.adiciona(new Contato(nome, telefone, email));
			
			System.out.println("Deseja continuar? (S/N)");
			parada = scan.next();
		}while(parada == "N");
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}
