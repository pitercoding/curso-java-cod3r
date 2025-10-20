module app.calculo {
    requires app.logging;
    exports br.com.app.calculo;

//    exports br.com.app.calculo.interno
//            to app.financeiro;

    opens br.com.app.calculo to app.financeiro;

    requires app.api;
    provides br.com.app.Calculadora
            with br.com.app.calculo.CalculadoraImpl;
}