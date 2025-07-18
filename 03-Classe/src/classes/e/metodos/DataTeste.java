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

        System.out.printf("Data 1: %d/%d/%d", d1.dia, d1.mes, d1.ano);
        System.out.printf("\nData 2: %d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
