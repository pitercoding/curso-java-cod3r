module app.financeiro {
    requires java.base; //Padrão já importado
    //requires app.calculo;
    requires app.api;
    uses br.com.app.Calculadora;
}