package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import  java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        // Formatação de pint - method reference
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // Stream.of
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        // Stream.of a partir de Array
        String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };
        Stream.of(maisLangs).forEach(print);

        // Stream a partir da classe Arrays
        Arrays.stream(maisLangs).forEach(print); // todos elementos do array
        Arrays.stream(maisLangs, 1, 3).forEach(print); //Somente índices 1 e 2 do array

        // Stream a partir de Collections
        List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print); // imprimindo na ordem
        outrasLangs.parallelStream().forEach(print); // imprimindo ordem aleatória

        // Stream a partir do método generate
        Stream.generate(() -> "a").forEach(print); // processa infinitamente sem ordem
        Stream.iterate(0, n -> n + 1).forEach(println); // processa infinitamente com ordem


    }
}
