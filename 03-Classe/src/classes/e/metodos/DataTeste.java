package classes.e.metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 2;
        d1.ano = 2000;

        var d2 = new Data();
        d2.dia = 30;
        d2.mes = 6;
        d2.ano = 1990;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
