package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();

        j1.x = 10; //Eixo X: Jogador1 inicia na posição pré-estabelecida
        j1.y = 10; //Eixo Y: Jogador1 inicia na posição pré-estabelecida

        j1.andar(Direcao.NORTE); //Chama o método andar usando o ENUM
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);

        System.out.println("Eixo X: " + j1.x); //Verifica quantas casas andou no eixo X
        System.out.println("Eixo Y: " + j1.y); //Verifica quantas casas andou no eixo Y
    }
}
