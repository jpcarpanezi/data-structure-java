package com.jp.estruturadados;

public class Main {

    public static void main(String[] args) {
	    Vetor array = new Vetor(3);

	    if(array.adiciona("Estrutura") ==  true){
		    System.out.println("Estrutura");
	    }

	    if(array.adiciona("De")){
		    System.out.println("De");
	    }

	    if(array.adiciona("Dados") == true){
	    	System.out.println("Dados");
	    }
    }
}
