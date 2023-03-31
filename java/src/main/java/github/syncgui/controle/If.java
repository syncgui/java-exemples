package github.syncgui.controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = input.nextDouble();

		if (media >= 7.0 && media <= 10.0) {
			System.out.println("Aprovado");
		}
		if (media < 7.0 && media >= 4.0) {
			System.out.println("Recuperação");
		}
		if (media < 4.0 && media >= 0.0) {
			System.out.println("Reprovado");
		}
		input.close();
	}
}
