package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        // 1. Preço real com desconto
        Function<Produto, Double> precoReal =
                prod -> prod.preco * (1 - prod.desconto);

        // 2. Imposto Municipal
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        // 3. Frete
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        // 4. Arredondar (2 casas decimais)
        UnaryOperator<Double> arredondar =
                preco -> Math.round(preco * 100.0) / 100.0;

        // 5. Formatar em moeda brasileira
        Function<Double, String> formatar =
                preco -> NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                        .format(preco);
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

        // Encadeando tudo
        String precoFinal = precoReal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("Preço final: " + precoFinal);
    }
}