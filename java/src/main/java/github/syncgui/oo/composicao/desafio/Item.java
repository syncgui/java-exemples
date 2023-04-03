package github.syncgui.oo.composicao.desafio;

public class Item {

    final int quantidadeItens;
    final Produto produto1;

    Item(Produto produto1, int quantidadeItens) {
        this.produto1 = produto1;
        this.quantidadeItens = quantidadeItens;
    }
}
