package github.syncgui.oo.polimorfismo;

import java.util.SortedSet;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.200);
        Feijao ingrediente2 = new Feijao(0.100);
        Sorvete sobremesa = new Sorvete(0.400);

        Comida ingrediente3 = new Arroz(0.3);

        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        System.out.println(convidado.getPeso());

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
