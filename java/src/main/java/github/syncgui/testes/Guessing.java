package github.syncgui.testes;

import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor = 76;
		int tentativas = 0;

		System.out.println("Digite um número de 1 a 100");

		for (int cont = 1; cont < 11; cont++) {
			System.out.print(cont + "a tentativa: ");
			int resposta = input.nextInt();
			if (resposta == valor) {
				System.out.println("Parabéns, você acertou!");
				break;
			} else if (resposta < valor && resposta <= 100 && resposta >= 0) {
				System.out.println("O valor informado é menor que o valor correto!");
				tentativas = 10 - cont;
				System.out.println("Você tem " + tentativas + " tentativas.");
			} else if (resposta > valor && resposta <= 100 && resposta >= 0) {
				System.out.println("O valor informado é maior que o valor correto!");
				tentativas = 10 - cont;
				System.out.println("Você tem " + tentativas + " tentativas.");
			} else if (resposta > 100 || resposta < 0) {
				System.out.println("Número inválido!");
				System.out.println("Você tem " + tentativas + " tentativas.");
				cont--;
			}
		}
		input.close();
	}
}
