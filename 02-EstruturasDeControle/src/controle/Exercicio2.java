package controle;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Divisível por 4
        // Divisível por 100 e por 400
        // O ano 2000 foi bissexto, mas o ano 1900 não foi.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " É um ano bissexto!");
        } else {
            System.out.println(ano + " NÃO é um ano bissexto!");
        }
    }
}

/**
 * Criar um programa informa se o ano atual é um ano bissexto;
 */