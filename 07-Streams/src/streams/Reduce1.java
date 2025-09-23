package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;

        Integer total1 = nums.stream().reduce(soma).get(); // Se passar só a função (sem valor inicial) precisa chamar o .()
        System.out.println("Total 1: " + total1);

        // Valor inicial é levado em consideração uma vez somente
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println("Total 2: " + total2);

        // Com parallelStream o valor inicial é levando em consideração em cada elemento
        Integer total3 = nums.parallelStream().reduce(100, soma);
        System.out.println("Total 3: " + total3);

        // Resultado foi um Optional<Integer>
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println); // Só printa se tiver resultado (ifPresent)
    }
}
