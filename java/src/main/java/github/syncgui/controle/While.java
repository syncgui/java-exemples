package github.syncgui.controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double total = 0;
		double nota = 0;
		int notasValidas = 0;
		int contador = 1;

		while (nota != -1) {
				System.out.printf("Digita a média do %d* aluno: ", contador++);
				nota = input.nextDouble();
				if (nota <= 10 && nota >= 0) {
					total = total + nota;
					notasValidas++;
				} else if (nota != -1){
					System.out.println("NOTA INVALIDA");
					contador--;
				}
		}
		double media = (total / notasValidas);
		System.out.println("A médias da turma foi: " + media);
		System.out.println("O total de notas válidas inseridas foram: " + notasValidas);

		input.close();
	}
}
