package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    //Construtor
    Data () {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970); //Chamando um outro construtor com this()
    }

    //Construtor
    Data (int dia, int mes, int ano) {
        this.dia = dia; //this.dia = referencia o objeto atual
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada (){
        final String formato = "%d/%d/%d";
        return String.format(formato, this.dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(this.obterDataFormatada());
    }
}
