package oo.heranca;

public class Jogador {

    int life = 100;
    int x;
    int y;

     //Construtor explícito
    Jogador(int x, int y){
        this.x =x;
        this.y = y;
    }

    boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x); //Conhecer a posição do oponente no eixo X
        int deltaY = Math.abs(y - oponente.y); //Conhecer a posição do oponente no eixo Y

        if (deltaX == 0 && deltaY == 1) { //Jogador e Oponente lado a lado
            oponente.life -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.life -= 10;
            return true;
        } else {
            return false;
        }
    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> {
                y--;
                break;
            }
            case LESTE -> {
                x++;
                break;
            }
            case SUL -> {
                y++;
                break;
            }
            case OESTE -> {
                x--;
                break;
            }
        }
        return true;
    }
}
