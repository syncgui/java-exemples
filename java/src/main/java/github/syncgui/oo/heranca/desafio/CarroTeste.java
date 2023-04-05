package github.syncgui.oo.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {

        Carro civic = new Civic();
        Ferrari ferrari = new Ferrari();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println(civic);

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari);

        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        civic.frear();
        System.out.println(civic);

        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println(ferrari);


    }
}
