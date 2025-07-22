package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // .offer() e .add() -> Adicionam elementos na fila
        //Comportamento diferente se fila cheia
        fila.add("Ana"); // Exceção se fila cheia
        fila.offer("Bia"); // Retorna False se fila cheia
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // .peek() e .element() -> Obtem próximo elemento da fila (sem remover)
        //Comportamento diferente se fila vazia
        System.out.println(fila.peek()); //Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança Exceção
        System.out.println(fila.element());

        System.out.println(fila.poll()); //Retorna false se fila vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove()); //Exceção se fila vazia

        /*
        fila.size();  TAMANHO
        fila.clear();  LIMPAR
        fila.isEmpty(); VERIFICAR SE ESTÁ VAZIA
        fila.contains(...);
        */
    }
}
