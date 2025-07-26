package oo.heranca.desafio;

public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari();
        Carro fusca = new Fusca();

        System.out.println("\nFerrari:");
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
