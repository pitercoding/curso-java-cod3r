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
}
