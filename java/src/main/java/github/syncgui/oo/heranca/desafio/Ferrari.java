package github.syncgui.oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligaTurbo = false;
    private boolean ligaAr;
    public Ferrari() {
        this(400);
    }
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligaTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligaTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligaAr = true;
    }

    @Override
    public void desligarAr() {
        ligaAr = false;
    }

    @Override
    public int getDelta() {
        if (ligaTurbo && !ligaAr) {
            return 35;
        } else if (ligaTurbo && ligaAr) {
            return 30;
        } else if (!ligaTurbo && !ligaAr) {
            return 20;
        } else {
            return 15;
        }
    }

    //    void acelerar() {
//        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
//            velocidadeAtual = VELOCIDADE_MAXIMA;
//        } else {
//        velocidadeAtual += 15;
//        }
//    }
}
