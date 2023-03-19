package org.example.fundamentos.operadores;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		double valor = input.nextDouble();

		System.out.println("O valor elevado a 2 é: " + Math.pow(valor, 2));
		System.out.println("O valor elevado a 3 é: " + Math.pow(valor, 3));
		
		input.close();
	}
}
