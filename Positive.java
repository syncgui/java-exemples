package org.example.testes;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int value = 1;
		int soma = 0;
		while (value > 0) {
			System.out.println("Informe um valor: ");
			value = input.nextInt();
			if (value < 0) {
				break;
			}
			 soma += value;
			System.out.println("Soma: " + soma);
		}
		System.err.println("Fim!");
		input.close();
	}
}
