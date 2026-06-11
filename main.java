import hashmap.*;

public class main {
    public static void main(String[] args) {
        char[] candies = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int[] x = {1,6,};
        int[] y = {2,4,6};
        int extraCandies = 1;

        long inicio = System.currentTimeMillis();
        System.out.println(UniqueNumberOccurrences.isUnique(x));
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de Ejecucicon: " + (fin - inicio) + "ms");


    }
}
