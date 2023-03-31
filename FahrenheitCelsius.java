package org.example.fundamentos.operadores;

import java.util.Scanner;

public class FahrenheitCelsius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a temperatura atual em Fahrenheit: ");
		double temperaturaF = entrada.nextDouble();
		final double ajuste = 32;
		final double multiplicador = 5.0 / 9.0;
		
		double celsius = (temperaturaF - ajuste) * multiplicador;
		
		System.out.println("A temperadura " + temperaturaF + "*F, equivale a " + celsius + "*C");
		
		entrada.close();
	}
}
