package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Princípe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro: livros) {
            System.out.println(livro);
        }

        //Removendo
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); //Exceção se pilha estiver vazia
        //System.out.println(livros.remove()); //Exceção se pilha estiver vazia

        /*
        livros.size();
        livros.clear();
        livros.contains();
        livros.isEmpty();
        */


    }
}
