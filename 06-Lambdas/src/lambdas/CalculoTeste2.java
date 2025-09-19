package lambdas;

public class CalculoTeste2 {
    /* Utilizando Funções Lambdas */
    public static void main(String[] args) {
        Calculo calc = (x, y) -> { return x + y; }; // lambda function
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y; //sem chaves quando for somente uma sentença de código
        System.out.println(calc.executar(2, 3));
    }
}
