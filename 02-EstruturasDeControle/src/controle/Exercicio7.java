package controle;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somadorDeNumeros = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um numero inteiro (ou negativo para sair): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                somadorDeNumeros += numero;
                System.out.printf("\nSoma parcial: %d\n", somadorDeNumeros);
            }
        }

        System.out.println("\nSoma Final = " + somadorDeNumeros);
        System.out.println("Finalizando programa...");
        scanner.close();
    }
}
