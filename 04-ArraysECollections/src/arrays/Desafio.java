package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Usuário informa a quantidade de notas
        System.out.print("Quantas notas quer lançar no sistema? ");
        int qtdeNotas = scanner.nextInt();

        //Baseado na quantidade de notas o array é criado
        double[] notas = new double[qtdeNotas];

        //Baseado no array "notas" s]ao feitas repetições para informar cada nota
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Notas do aluno: " + Arrays.toString(notas));

        // Foreach para percorrer e somar todas as notas
        double soma = 0;
        for (double nota: notas) {
            soma += nota;
        }

        //Calculo da média
        double media = soma / notas.length;
        System.out.printf("Média do aluno: %.2f", media);
        
        scanner.close();
    }
}
