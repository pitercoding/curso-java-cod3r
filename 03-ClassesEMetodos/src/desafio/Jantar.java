package desafio;

public class Jantar {
    public static void main(String[] args) {
        //Instanciar uma pessoa
        //Instanciar duas comidas
        //Peso pessoa antes e depois de comer

        Comida c1 = new Comida("Arroz", 0.150);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p1 = new Pessoa("Arlindo", 99.8);

        System.out.println(p1.apresentar());
        p1.comer(c1);

        System.out.println(p1.apresentar());
        p1.comer(c2);

        System.out.println(p1.apresentar());

    }
}
