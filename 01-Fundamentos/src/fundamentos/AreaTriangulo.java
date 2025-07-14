package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // area = (base * altura) / 2
        System.out.println("==== Área de um triângulo ====");
        System.out.print("Digite a Base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a Altura: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f.", area);

        scanner.close();
    }

    public static class FahrenheitParaCelcius {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // °C = (°F - 32) * 5/9
            System.out.println("==== Conversor de °F para °C ===");
            System.out.print("Temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celcius = (fahrenheit - 32) * 5/9;

            System.out.printf("%.2f °F = %.2f °C", fahrenheit, celcius);

        }
    }

    public static class Equacao {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Equação: ax² + bx + c = 0");

            System.out.print("Digite o valor de A: ");
            int a = scanner.nextInt();

            System.out.print("Digite o valor de B: ");
            int b = scanner.nextInt();

            System.out.print("Digite o valor de C: ");
            int c = scanner.nextInt();

            int delta = (b * b) - (4 * a * c);

            System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);

            System.out.println("\nO delta é: " + delta);

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.printf("O x1 da equação é: %.2f", x1);

            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("\nO x2 da equação é: %.2f" ,x2);

            scanner.close();
        }
    }
}
