package github.syncgui.oo;

public class Carro {

    final Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

    Portas porta = new Portas();

    void acelerar() {
        if (motor.fatorInjecao < 2.6 && !porta.getPortas()) {
        motor.fatorInjecao += 0.4;
        } else {
            System.out.println("Não posso acelerar, porta aberta!");
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
        motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}
