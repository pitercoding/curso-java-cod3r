package desafio2;

public class Animal {
    String nome;
    double peso;

    Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Alimento alimento) {
        if (alimento != null) {
            this.peso += alimento.peso;
        }
    }

    String apresentar() {
        return "Sou uma " + nome + " e peso " + peso + " Kgs.";
    }
}
