package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);

        System.out.println("Peso inicial: " + convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.printf("Peso após almoço: %.2f Kg.", convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);
        convidado.comer(sobremesa);
        System.out.printf("\nPeso após sobremesa: %.2f Kg.", convidado.getPeso());


    }
}
