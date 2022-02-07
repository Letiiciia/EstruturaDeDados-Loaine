package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho>0) {
			s.append(elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
	
//	public void adiciona(String elemento) {
//		for(int i = 0; i  < this.elementos.length; i++) {
//			if(this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}

//	}

//	public void adiciona(String elemento) throws Exception {
//		if (this.tamanho > this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;
//		} else {
//			throw new Exception("Vetor já está cheio, não é possível adicionar mais!");
//		}
//
//	}
	
	public boolean adiciona(T elemento) {
		aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}

	}
	
	public boolean adiciona(int posicao, T elemento) {
		aumentaCapacidade();
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = this.tamanho -1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[])new Object[this.elementos.length*2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
				
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return elementos[posicao];
	}
	
	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento) {
		return busca(elemento) > -1;
	}
	
	
	public void remove(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
}
