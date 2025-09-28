package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;
        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e){
            System.out.println("ERRO ao imprimir nome do usuário!");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
        }

        System.out.println("Fim!");
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
