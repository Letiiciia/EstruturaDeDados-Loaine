package com.loiane.estruturadados.vetor.base;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}

	}

	protected boolean adiciona(int posicao, T elemento) {
		aumentaCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi??o inv?lida");
		}

		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return false;
	}

	protected void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];

			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(elementos[this.tamanho - 1]);
		}
		s.append("]");

		return s.toString();
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
}
