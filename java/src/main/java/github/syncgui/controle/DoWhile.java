package github.syncgui.controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

			String teste = "";
			
			do {
				System.out.println("Você precisa falar" 
						+ "\nas palavrinhas mágicas...");
				System.out.println("Quer sair?");
				teste = input.nextLine();
			} while (!teste.equalsIgnoreCase("por favor"));
			
			System.out.println("Obrigado!");

		input.close();
	}
}
