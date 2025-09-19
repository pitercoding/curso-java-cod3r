package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    /* Utilizando Funções Lambdas */
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> { return x + y; }; // lambda function
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y; //sem chaves quando for somente uma sentença de código
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; }; // lambda function
        System.out.println(calc2.apply(2, 3));

        calc = (x, y) -> x * y; //sem chaves quando for somente uma sentença de código
        System.out.println(calc2.apply(2, 3));
    }
}
