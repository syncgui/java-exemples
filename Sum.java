package org.example.testes;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int maior = 0;

		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "o valor: ");
			int valor = input.nextInt();
			maior += valor;
		}
		System.out.println("Total: " + maior);
		input.close();
	}
}
