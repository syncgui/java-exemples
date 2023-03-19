package org.example.testes;

import java.util.Scanner;

public class De0a10Par {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int valor = input.nextInt();
		if (valor >= 0 && valor <= 10 && valor % 2 == 0) {
			System.out.println("Valor está entregue 0 e 10, e é Par!");
		} else {
			System.out.println("Valor inválido!");
		}
		input.close();
	}
}
