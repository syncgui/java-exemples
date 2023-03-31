package github.syncgui.testes;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos dias o ano atual tem?");
		int diasAno = input.nextInt();
		
		if (diasAno == 366) {
			System.out.println("O ano atual é Bissexto!");
		} else {
			System.out.println("O ano atual é normal!");
		}

		input.close();
	}
}
