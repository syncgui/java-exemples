package github.syncgui.oo.composicao.desafio;

public class CompraTeste {

    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto(2000, "Notebook"), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto(1000, "Impressora"), 1);

        Cliente cliente1 = new Cliente("Guilherme");
        cliente1.adicionarCompra(compra1);
        cliente1.listaCompras.add(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
