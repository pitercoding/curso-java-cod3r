package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Quadrado e Cubo ===");
        System.out.print("Informe um número: ");
        double valor = scanner.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.printf("Valor ao quadrado: %.2f", quadrado);
        System.out.printf("\nValor ao cubo: %.2f", cubo);

        scanner.close();
    }
}
