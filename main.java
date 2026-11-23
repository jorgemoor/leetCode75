import arraystring.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};

        int[] z = {0, 1, 2, 3, 4, 5};
        int[] x = {3, 5,-6, 2,-1, 4};

        int[] y = {2,4,6};
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        int extraCandies = 3;
        String word1 = "abcd", word2 = "pq";

        long inicio = System.currentTimeMillis();
        System.out.println(kidsWithCandies.kwc(candies, extraCandies));
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de Ejecucicon: " + (fin - inicio) + "ms");


    }



}

