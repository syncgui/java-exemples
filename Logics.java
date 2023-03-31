package org.example.fundamentos.operadores;

public class Logics {
	public static void main(String[] args) {
		
		boolean jobterca = true;
		boolean jobquinta = false;	
		
		boolean tv32 = jobterca ^ jobquinta;
		
		System.out.println("Vamos comprar a TV de 32\"? " + tv32);
		
		boolean tv50 = jobterca && jobquinta;
		
		System.out.println("Vamos comprar a TV de 50\"? " + tv50);
		
		boolean ice = jobterca || jobquinta;
		
		System.out.println("Vamos tomar sorvete? " + ice);
		
		System.out.println("Nos mantemos saudaveis? " + !ice);

	}
}
