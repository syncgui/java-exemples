package org.example.fundamentos.operadores;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o peso: ");
		double weight = input.nextDouble();
		System.out.print("Digite a altura: ");
		double height = input.nextDouble();
		
		double imc = weight / Math.pow(height, 2);
		
		System.out.printf("O paciente com altura: %.2f e peso: %.2f tem IMC de: %.2f", height, weight, imc);
		
		input.close();
	}
}
