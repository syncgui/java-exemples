package github.syncgui.oo.heranca.teste;

import github.syncgui.oo.heranca.desafio.Carro;
import github.syncgui.oo.heranca.desafio.Civic;
import github.syncgui.oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari(400);

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic);

        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);

        System.out.println(ferrari.velocidadeDoAr());

        civic.frear();
        System.out.println(civic);

        ferrari.frear();
        System.out.println(ferrari);


    }
}
