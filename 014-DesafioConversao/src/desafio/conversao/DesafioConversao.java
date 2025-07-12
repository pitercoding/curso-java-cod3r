package desafio.conversao;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro salário: ");
        String salario1 = scanner.next().replace(",", ".");
        System.out.print("Informe o segundo salário: ");
        String salario2 = scanner.next().replace(",", ".");
        System.out.print("Informe o terceiro salário: ");
        String salario3 = scanner.next().replace(",", ".");

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);

        double soma = sal1 + sal2 + sal3;
        double media = soma / 3;
        System.out.println("Soma dos últimos três salários = " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
