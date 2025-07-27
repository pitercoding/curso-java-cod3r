package oo.heranca.desafio;

public class Ferrari extends Carro {

    public Ferrari(){
        this(315);
    }

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

    /*@Override
    public void acelerar() {
        velocidadeAtual += 15;
    }*/

    @Override
    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }
}
