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
}
