package github.syncgui.oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    final String nomeCliente;
    final ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    void adicionarCompra(Compra compra) {
        this.listaCompras.add(compra);
    }

    double obterValorTotal() {
        double valorTotalCompra = 0;
        for (Compra compras: listaCompras) {
            valorTotalCompra += compras.obterValorTotalCompra();
        }
        return valorTotalCompra;
    }
}

