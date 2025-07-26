package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro j1 = new Monstro();
        j1.x = 10; //Eixo X: Jogador1 inicia na posição pré-estabelecida
        j1.y = 10; //Eixo Y: Jogador1 inicia na posição pré-estabelecida

        Heroi j2 = new Heroi();
        j2.x = 10; //Eixo X: Jogador2 inicia na posição pré-estabelecida
        j2.y = 11; //Eixo Y: Jogador2 inicia na posição pré-estabelecida

        System.out.println("Life Monstro: " + j1.life);
        System.out.println("Life Heroi: " + j2.life);

        j1.atacar(j2);
        System.out.println("\nMonstro ataca Heroi!");
        System.out.println("Life Monstro: " + j1.life);
        System.out.println("Life Heroi: " + j2.life);

        j2.atacar(j1);
        System.out.println("\nContra ataque do Heroi!");
        System.out.println("Life Monstro: " + j1.life);
        System.out.println("Life Heroi: " + j2.life);


    }
}
