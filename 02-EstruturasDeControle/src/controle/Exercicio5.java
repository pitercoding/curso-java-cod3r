package controle;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /**Refatorar o exercício 04, utilizando a estrutura switch.*/

        int contadorDeDivisores = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite um numero para verificar se é primo: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0){
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores) {
            case 0:
                System.out.println("O número " + numero + " É primo.");
                break;
            default:
                System.out.println("O número " + numero + " NÃO é primo.");
        }
        scanner.close();
    }
}
