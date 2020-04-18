package com.jp.estruturadados;

public class Main {

    public static void main(String[] args) {
	    Vetor array = new Vetor(10);

	    if(array.adiciona("Estrutura")){
		    //System.out.println("Estrutura");
	    }

	    if(array.adiciona("De")){
		    //System.out.println("De");
	    }

	    if(array.adiciona("Dados")){
	    	//System.out.println("Dados");
	    }

	    System.out.println(array.toString());
    }
}
