package github.syncgui.arrays;

import java.util.Scanner;

public class DesafioForeach {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        double soma = 0;

        System.out.println("Quantas notas o aluno irá ter?");
        int index = input.nextInt();

        double[] notasA = new double[index];

        for(int i = 0; i < notasA.length; i++) {
            System.out.println("Digite a " + (i + 1) + " nota: ");
            notasA[i] = input.nextDouble();
        }

        for(double notas: notasA) {
            soma += notas;
        }

        double media = soma / notasA.length;

        System.out.println("A média do aluno foi: " + media);
    }
}
