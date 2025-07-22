package collections;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho: " + conjunto.size());

        conjunto.add("Teste"); // Não add repetido
        conjunto.add('x');
        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

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
