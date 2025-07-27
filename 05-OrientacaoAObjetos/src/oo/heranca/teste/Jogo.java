package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10; //Eixo X: Posição pré-estabelecida
        monstro.y = 10; //Eixo Y: Posição pré-estabelecida

        Heroi heroi = new Heroi(10, 11); //Posição definida pelo construtor

        System.out.println("Life Monstro: " + monstro.life);
        System.out.println("Life Heroi: " + heroi.life);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        System.out.println("\nMonstro fugiu para o Norte!");
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("\nApós Batalha:");
        System.out.println("Life Monstro: " + monstro.life);
        System.out.println("Life Heroi: " + heroi.life);
    }
}
