package fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelcius {
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
