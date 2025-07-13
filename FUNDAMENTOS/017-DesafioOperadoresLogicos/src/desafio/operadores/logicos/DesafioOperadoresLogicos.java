package desafio.operadores.logicos;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

       if (trabalhoTerca && trabalhoQuinta){
           System.out.println("Resultado: Comprou TV de 50 polegadas e tomou sorvete!");
       } else if (trabalhoTerca ^ trabalhoQuinta) {
           System.out.println("Resultado: Comprou TV de 35 polegadas e tomou sorvete!");
       } else {
           System.out.println("Resultado: Não comprou TV e não tomou sorvete!");
       }
    }
}
