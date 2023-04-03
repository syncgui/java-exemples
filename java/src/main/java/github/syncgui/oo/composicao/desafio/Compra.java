package github.syncgui.oo.composicao.desafio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> listaItens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.listaItens.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto(preco, nome);
        this.listaItens.add(new Item(produto, quantidade));
    }

    double obterValorTotalCompra() {
        double valorCompra = 0;
        for (Item itens : listaItens) {
            valorCompra += itens.quantidadeItens * itens.produto1.precoProduto;
        }
        return valorCompra;
    }
}
