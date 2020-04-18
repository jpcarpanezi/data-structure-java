package com.jp.estruturadados;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;

	// Class constructor
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	// Returns array size
	public int tamanho(){
		return this.tamanho;
	}

	// Adds new elements to string
	public boolean adiciona(String elemento){
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	// Returns string
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if(this.tamanho > 0){
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}

	// Searches for element in array
	public String busca(int posicao) throws IllegalArgumentException{
		if(!(posicao >= 0 && posicao < this.tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}

		return this.elementos[posicao];
	}
}
