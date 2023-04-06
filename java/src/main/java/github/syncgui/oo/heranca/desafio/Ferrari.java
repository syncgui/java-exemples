package github.syncgui.oo.heranca.desafio;

public class Ferrari extends Carro{
    public Ferrari() {
        this(400);
    }
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 500;
    }
//    void acelerar() {
//        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
//            velocidadeAtual = VELOCIDADE_MAXIMA;
//        } else {
//        velocidadeAtual += 15;
//        }
//    }
}
