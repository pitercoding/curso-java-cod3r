package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            gerarErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    //Não checada ou não verificada
    static void gerarErro1() {
        throw new RuntimeException("Erro #01!");
    }

    //Exceção checada ou verificada
    static void gerarErro2() throws Exception {
        throw new Exception("Erro #02!");
    }
}
