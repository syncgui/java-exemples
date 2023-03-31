package org.example.testes;

import java.util.Scanner;

public class LetterByLetter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String entrada = input.next();
		
		for (int i = 0; i < entrada.length(); i++) {
			System.out.println(entrada.charAt(i));
		}
		input.close();
	}
}
