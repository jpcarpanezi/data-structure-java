package com.jp.estruturadados;

public class Main {

    public static void main(String[] args) {
	    Vetor array = new Vetor(10);

	    array.adiciona("Estrutura");
	    array.adiciona("De");
	    array.adiciona("Dados");;

	    System.out.println("Número de Elementos: " + array.tamanho());
	    System.out.println("Elementos do Vetor: " + array.toString());
	    System.out.println("Elemento buscado: " + array.busca(1));
    }
}
