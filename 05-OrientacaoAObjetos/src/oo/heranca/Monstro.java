package oo.heranca;

public class Monstro extends Jogador{

    //Construtor explícito
    Monstro() {
        this(0, 0);
    }

    Monstro(int x, int y) {
        super(x, y);
    }
}
