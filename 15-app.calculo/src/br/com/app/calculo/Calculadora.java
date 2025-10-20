package br.com.app.calculo;

import br.com.app.calculo.interno.OperacoesAritmeticas;
import br.com.app.logging.Logger;

public class Calculadora {

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }
}
