package github.syncgui.oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", "Lucas", -30);
        p1.setIdade(200); // alterar

        System.out.println(p1.getIdade()); // ler
        System.out.println(p1.getNomeCompleto()); // toString
    }
}
