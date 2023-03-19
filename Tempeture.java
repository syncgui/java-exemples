package org.example.fundamentos;

public class Tempeture {
	
	public static void main(String[] args) {
		double f = 0;
		final double AJUSTE = 32;
		final double MULTIPLICADOR = 5.0/9.0;
		double c =(f - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura " + f +"*F, equivale a " + c +"*C" );
		
		f = 0;
		c =(f - AJUSTE) * MULTIPLICADOR;
		System.out.println("A temperatura " + f +"*F, equivale a " + c +"*C" );
	}
}

// (F - 32) * 5.0/9.0 = C