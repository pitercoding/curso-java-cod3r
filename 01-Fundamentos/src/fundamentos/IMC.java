package fundamentos;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // IMC kg/m² = peso / (altura * altura)
        System.out.println("==== Calculadora de IMC ===");
        System.out.print("Informe seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe sua altura (cm): ");
        double altura = scanner.nextDouble();

        altura = altura /100;

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC é: %.1f", imc);

        scanner.close();
    }
}
