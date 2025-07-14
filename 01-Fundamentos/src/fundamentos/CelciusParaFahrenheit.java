package fundamentos;

import java.util.Scanner;

public class CelciusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // °F = °C * 1,8 + 32
        System.out.println("==== Conversor de °C para °F ===");
        System.out.print("Temperatura em °C: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = celcius * 1.8 + 32;
        System.out.printf("%.2f °C =  %.2f °F", celcius, fahrenheit);
    }

    public static class DesafioCalculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double num2 = scanner.nextDouble();
            System.out.print("Qual operação deseja fazer? [+ , - , * , / , %]: ");
            String operacao = scanner.next();

            double resultado = "+".equals(operacao) ? num1 + num2 : 0;
            resultado = "-".equals(operacao) ? num1 - num2 : resultado;
            resultado = "*".equals(operacao) ? num1 * num2 : resultado;
            resultado = "/".equals(operacao) ? num1 / num2 : resultado;
            resultado = "%".equals(operacao) ? num1 % num2 : resultado;

            System.out.printf("%.2f %s %.2f = %.2f", num1 , operacao, num2, resultado);
            scanner.close();
        }

    }
}
