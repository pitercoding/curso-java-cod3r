package oo.heranca.desafio;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }
}
