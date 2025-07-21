package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem na turma? ");
        int qtdeAlunosDaTurma = scanner.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotasPorAluno = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunosDaTurma][qtdeNotasPorAluno];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) { // a = aluno
            for (int n = 0; n < notasDaTurma[a].length; n++) { // n = nota

                System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
                notasDaTurma[a][n] = scanner.nextDouble(); //Aluno e nota recebem os valores respectivamente
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (qtdeAlunosDaTurma * qtdeNotasPorAluno); //ex: 3 alunos * 3 notas = 9. total /9 = média
        System.out.printf("Média da turma: %.2f", media);

        System.out.println("\nNotas dos alunos:");
        for (double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scanner.close();
    }
}
