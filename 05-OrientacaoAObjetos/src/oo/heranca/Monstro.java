package oo.heranca;

public class Monstro extends Jogador{

    //Construtor explícito
    public Monstro() {
        this(0, 0);
    }

    public Monstro(int x, int y) {
        super(x, y);
    }
}
