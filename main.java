import stack.*;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        char[] candies = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int[] z = {0, 1, 2,3, 4,5};
        int[] x = {3, 5,-6,2,-1,4};

        int[] y = {2,4,6};
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        int extraCandies = 1;
        String word1 = "erase*****", word2 = "abbccc";

        long inicio = System.currentTimeMillis();
        System.out.println(Arrays.toString(AsteroidCollision.asteroidCollision(x)));
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de Ejecucicon: " + (fin - inicio) + "ms");


    }
}
