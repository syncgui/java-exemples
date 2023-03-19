package org.example.fundamentos.operadores;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a temperatura atual em Celsius: ");
		double temperaturaC = entrada.nextDouble();
		final double ajuste = 32;
		final double multiplicador = 9.0 / 5.0;
		
		double fahrenheit = (temperaturaC * multiplicador) + ajuste;
		
		System.out.printf("A temperadura %.2f *C, equivale a %.2f *F", temperaturaC, fahrenheit);
		
		entrada.close();
	}
}
