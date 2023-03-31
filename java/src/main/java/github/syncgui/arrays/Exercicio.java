package github.syncgui.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double totalAlunoA = 0;

        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        double mediaA = totalAlunoA / notasAlunoA.length;
        System.out.println(mediaA);

        final double notaArmazenada = 5.9;

        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };

        double totalAlunoB = 0;

        for(int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        double mediaB = totalAlunoB / notasAlunoB.length;

        System.out.println(mediaB);
    }
}
