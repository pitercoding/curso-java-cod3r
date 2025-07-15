package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota [-1 para finalizar o programa]: ");
            nota = scanner.nextDouble();

            if (nota <= 10 || nota >= 0) {
                total += nota;
                quantidadeDeNotas ++;
            } else if (nota != -1) {
                System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
            }
        }

        //Cálculo média
        double media = total / quantidadeDeNotas;
        System.out.printf("\nForam informadas %d notas.", quantidadeDeNotas);
        System.out.println("\nA média da turma é: " + media);

        scanner.close();
    }
}
