package controle;

import java.util.Scanner;

public class Exercicio8 {

    /**
     * 8. Crie um programa que recebe 10 valores e ao final imprima o maior número.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maiorValor = 0;
        int soma = 0;

        do {
            System.out.printf("Informe o %dº número: ", contador +1);
            int valor = scanner.nextInt();

            soma += valor;

            if (valor > maiorValor) {
                maiorValor = valor;
            }
            contador++;
        } while (contador != 10);

        System.out.printf("\nO maior valor foi: " + maiorValor);
        System.out.println("\nA soma de todos os números é: " + soma);
        scanner.close();
    }
}
