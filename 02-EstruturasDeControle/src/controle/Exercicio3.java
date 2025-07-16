package controle;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("\nMédia: " + media);
            System.out.println("Situação: Aprovado!");
        } else if (media < 7 && media >= 4) {
            System.out.println("\nMédia: " + media);
            System.out.println("Situação: Recuperação!");
        } else {
            System.out.println("\nMédia: " + media);
            System.out.println("Situação: Reprovado!");
        }
        scanner.close();
    }
}
