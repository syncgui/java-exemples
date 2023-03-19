package org.example.testes;

import java.util.Scanner;

public class PrimeValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe um valor");
		double valor = input.nextDouble();

		int primo = 0;

		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				primo++;
			} 
		}
	if (primo == 2) {
		System.out.println("Primo");
	} else {
		System.out.println("Não primo");
	}
		input.close();
	}
}
