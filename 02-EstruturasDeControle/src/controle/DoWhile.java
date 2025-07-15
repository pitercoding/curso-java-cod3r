package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = "";

        do {
            System.out.print("Fale a palavras mágica...Quer sair? ");
            texto = scanner.nextLine();
        } while (!texto.equalsIgnoreCase("sim"));

        System.out.println("Saiu do laço! Parabéns!");
        scanner.close();
    }
}
