package temperatura;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // °C = (°F - 32) * 5/9
        System.out.println("==== Conversor de Temperatura ===");
        System.out.print("Temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        final int subtrair = 32;
        final double multiplicador = 5.0/9.0;
        double celcius = ((fahrenheit - subtrair) * multiplicador);

        System.out.println(String.format("%.1f", fahrenheit) + " °F são " + String.format("%.1f", celcius) + " °C.");
        scanner.close();
    }
}
