package desafio2;

public class Almoco {
    public static void main(String[] args) {

        Alimento a1 = new Alimento("Carne", 1.000);
        Alimento a2 = new Alimento("Ovo", 0.150);

        Animal animal1 = new Animal("Águia", 10.0);

        System.out.println(animal1.apresentar());
        animal1.comer(a1);

        System.out.println(animal1.apresentar());
        animal1.comer(a2);

        System.out.println(animal1.apresentar());
    }
}
