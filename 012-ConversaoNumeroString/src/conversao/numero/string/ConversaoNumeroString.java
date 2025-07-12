package conversao.numero.string;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println("Tamanho: " + num1.toString().length());

        int num2 = 100000;
        System.out.println("Tamanho: " + Integer.toString(num2).length());

    }
}
