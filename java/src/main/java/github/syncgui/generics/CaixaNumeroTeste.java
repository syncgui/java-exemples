package github.syncgui.generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(123.6);
        System.out.println(caixaA.abrir());

        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.guardar(12223.6);
        System.out.println(caixaB.abrir());

    }
}
