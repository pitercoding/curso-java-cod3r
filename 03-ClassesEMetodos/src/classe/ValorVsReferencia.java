package classe;

public class ValorVsReferencia {

    public static void main(String[] args) {
        double a = 2;
        double b = a; //atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; //atribuição por referência (objeto)

        d1.dia = 30;
        d2.mes = 06;
        d1.ano = 1990;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao (Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }
}
