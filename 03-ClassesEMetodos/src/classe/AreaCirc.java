package classe;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415; // Membro estático valor pertence a classe

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area () {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return PI * Math.pow(raio, 2);
    } //Método estático que pertence a classe
}
