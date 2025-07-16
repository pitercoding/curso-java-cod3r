package controle;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /**
         * Criar um programa que receba um número e diga se ele é um número primo.
         */
        int contadorDeDivisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO número " + num + " é primo.");
        } else {
            System.out.println("\nO número " + num + " não é primo.");
        }
        scanner.close();
    }
}
