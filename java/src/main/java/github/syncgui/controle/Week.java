package github.syncgui.controle;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um dia da semana: ");
		String diaSemana = input.nextLine();

		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("01");
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("02");
		} else if (diaSemana.equalsIgnoreCase("terça")
				  || diaSemana.equalsIgnoreCase("terca")) {
			System.out.println("03");
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("04");
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("05");
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("06");
		} else if (diaSemana.equalsIgnoreCase("sábado")
				|| diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("07");
		} else {
			System.out.println("Dado inválido!");
		}
		input.close();
	}
}
