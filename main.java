import hashmap.*;

public class main {
    public static void main(String[] args) {
        char[] candies = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int[] x = {1,6};
        int[] y = {2,4,6};
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        int extraCandies = 1;
        String word1 = "cabbba", word2 = "abbccc";

        long inicio = System.currentTimeMillis();
        System.out.println(EqualRowColumnPairs.equalPairs(grid));
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de Ejecucicon: " + (fin - inicio) + "ms");


    }
}
