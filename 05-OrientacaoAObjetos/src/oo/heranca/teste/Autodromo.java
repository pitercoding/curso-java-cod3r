package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Autodromo {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari(400);
        Carro fusca = new Fusca();

        System.out.println("\nFerrari:");
        ferrari.ligarTurbo();
        ferrari.ligarAr();
        ferrari.desligarAr();

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.acelerar();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.desligarTurbo();
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        ferrari.frear();
        ferrari.frear();
        System.out.println(ferrari);
        ferrari.frear();
        ferrari.frear();
        System.out.println(ferrari);


        System.out.println("\nFusca:");
        fusca.acelerar();
        System.out.println(fusca);
        fusca.acelerar();
        System.out.println(fusca);
        fusca.acelerar();
        System.out.println(fusca);
        fusca.frear();
        fusca.frear();
        fusca.frear();
        System.out.println(fusca);


    }
}
