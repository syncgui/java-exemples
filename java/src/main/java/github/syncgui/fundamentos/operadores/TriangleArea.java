package github.syncgui.fundamentos.operadores;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor da base do triângulo : ");
		double base = input.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		double altura = input.nextDouble();

		double ajuste = 2.0;

		double area = (base * altura) / ajuste;

		System.out.println("A área do triângulo é: " + area);

		input.close();
	}
}
