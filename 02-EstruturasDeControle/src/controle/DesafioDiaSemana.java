package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String entrada = scanner.next().trim();

        if (entrada.equalsIgnoreCase("domingo")) {
            System.out.println("Dia 1.");
        } else if (entrada.equalsIgnoreCase("segunda")) {
            System.out.println("Dia 2.");
        } else if (entrada.equalsIgnoreCase("terça") || entrada.equals("terca")) {
            System.out.println("Dia 3.");
        } else if (entrada.equalsIgnoreCase("quarta")) {
            System.out.println("Dia 4.");
        } else if (entrada.equalsIgnoreCase("quinta")) {
            System.out.println("Dia 5.");
        } else if (entrada.equalsIgnoreCase("sexta")) {
            System.out.println("Dia 6.");
        } else if (entrada.equalsIgnoreCase("sabado") || entrada.equals("sábado")) {
            System.out.println("Dia 7.");
        } else {
            System.out.println("Dia da semana inválido!");
        }
        scanner.close();
    }
}
