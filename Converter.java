package org.example.fundamentos;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);

		System.out.println("Digite o primeiro salário: ");
		String s1 = text.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salário: ");
		String s2 = text.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salário: ");
		String s3 = text.nextLine().replace(",", ".");

		double cs1 = Double.parseDouble(s1);
		double cs2 = Double.parseDouble(s2);
		double cs3 = Double.parseDouble(s3);

		Double media = (cs1 + cs2 + cs3) / 3;
		System.out.println("A média salarial é: " + media);

		text.close();
	}
}
