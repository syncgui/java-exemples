package org.example.fundamentos.operadores;

public class Arithmetic {
	
	public static void main(String[] args) {
	double operador1 = Math.pow(6 * (3 + 2), 2) / (3 * 2);
	
	double operador2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
	
	double resultadooperador = Math.pow(operador1 - operador2, 3) / Math.pow(10, 3);
	System.out.println("O resultado é :" + resultadooperador);
		
//		int a = 3 + 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
	}
}
