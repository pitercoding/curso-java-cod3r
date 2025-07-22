package collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        //Não suporte tipo primitivo, por isso:
        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); //char -> Character

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("Teste"); // Não add repetido
        conjunto.add('x');
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(".remove(): " + conjunto.remove("teste"));
        System.out.println(".remove(): " + conjunto.remove("Teste"));
        System.out.println(".remove(): " + conjunto.remove('x'));

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(".contains(): " + conjunto.contains('x'));
        System.out.println(".contains(): " + conjunto.contains(1));
        System.out.println(".contains(): " + conjunto.contains(true));

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // união entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(".retainAll(): " + conjunto);

        conjunto.clear();
        System.out.println(".clear(): " + conjunto);

    }
}
