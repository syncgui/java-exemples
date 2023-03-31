package github.syncgui.classe.challange;

import org.w3c.dom.ls.LSOutput;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void Comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá, meu nome é " + nome + " e tenho " + peso + " Kg.";
    }
}
