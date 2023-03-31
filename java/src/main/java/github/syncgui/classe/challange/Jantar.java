package github.syncgui.classe.challange;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Feijoada", 1.254);
        Comida c2 = new Comida("Macarronada", 0.958);

        Pessoa p = new Pessoa("Gui", 99.8);

        System.out.println(p.apresentar());
        p.Comer(c1);

        System.out.println(p.apresentar());
        p.Comer(c2);
        
        System.out.println(p.apresentar());
    }
}
