package br.com.app.financeiro;

import br.com.app.calculo.Calculadora;
import br.com.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2,3,4,9));

        OperacoesAritmeticas op = new OperacoesAritmeticas();
        System.out.println(op.soma(4,5,6,15));
    }
}
