package arrays;

import java.util.Arrays;

public class Exercicio {
    /**
     * Arrays:
     * Indexado
     * Tamanho fixo
     * Dados homogeneos
     */
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA)); //Notas não definidas ainda

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA)); //Notas definidas

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) { //Percorre cada índice até o fim do Array
            totalAlunoA += notasAlunoA[i]; //Soma as notas de cada índice na variável totalAlunoA
        }

        double mediaAlunoA = totalAlunoA / notasAlunoA.length; // Total / número de notas
        System.out.printf("Média AlunoA: %.2f\n\n", mediaAlunoA);



        final double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        double mediaAlunoB = totalAlunoB / notasAlunoB.length;
        System.out.printf("Média AlunoB: %.2f", mediaAlunoB);
    }
}
