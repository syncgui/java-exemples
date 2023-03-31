package github.syncgui.colecoes;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia"
        fila.add("Ana"); // Lnaça uma exceção
        fila.offer("Bia"); // Retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // peek e element -> obter o próximo elementos na fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia"
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

        System.out.println(fila.size());
        //  System.out.println(fila.clear());
        System.out.println(fila.isEmpty());
        System.out.println(fila.contains("Ana"));

        // pool e remove -> obter o próximo elementos na fila e remove)
        // Diferença é o comportamento ocorre quando a fila está vazia"
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
    }
}
