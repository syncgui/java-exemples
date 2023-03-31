package github.syncgui.controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String entrada = "";
		
		while (!entrada.equalsIgnoreCase("sair")) {
			System.out.println("Digite um nome: ");
			entrada = input.next();
			if (!entrada.equalsIgnoreCase("sair")) {
				System.out.println("Você digitou: " + entrada);
			} else {
				System.out.println("Saindo");
			}
		}
		input.close();
	}
}
