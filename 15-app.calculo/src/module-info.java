module app.calculo {
    requires app.logging;
    exports br.com.app.calculo;

    exports br.com.app.calculo.interno
            to app.financeiro;
}