package github.syncgui.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatrizMe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos tem essa turma? ");
        int qtdAlunos = input.nextInt();
        System.out.print("Quantas notas cada aluno tem? ");
        int qtdNotas = input.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double totalNotas = 0;

        for(int a = 0; a < notasTurma.length; a++) {
            for(int n = 0; n < notasTurma[a].length; n++) {
                System.out.print("Informe a " + (n + 1) + "* nota do " + (a + 1) + "* aluno:");
                notasTurma[a][n] = input.nextDouble();
                totalNotas += notasTurma[a][n];
            }
        }
        double media = totalNotas / (qtdAlunos * qtdNotas);
        System.out.println(media);

        for(double[] notasDoAluno: notasTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
    }
}
