package github.syncgui.arrays;

public class Exercicio2Foreach {
    public static void main(String[] args) {

        double totalNotas1 = 0;
        double totalNotas2 = 0;

        double[] notas1 = new double[4];

        notas1[0] = 7.9;
        notas1[1] = 8;
        notas1[2] = 6.7;
        notas1[3] = 9.7;

        for (double notas: notas1) {
            System.out.print(notas + " ");
            totalNotas1 += notas;
        }

        double media1 = totalNotas1 / notas1.length;

        System.out.println("Média foi: " + media1);

        System.out.println();

        double[] notas2 = { 7.9, 8, 6.7, 9.7 };

        for (double notas: notas2) {
            System.out.print(notas + " ");
            totalNotas2 += notas;
        }

        double media2 = totalNotas2 / notas2.length;

        System.out.println("Média foi: " + media2);
    }
}
