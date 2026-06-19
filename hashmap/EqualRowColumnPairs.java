package hashmap;

import java.util.*;


public class EqualRowColumnPairs {
    public static int equalPairs(int[][] grid){
        int n = grid.length;
        int col[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                col[j] = grid[j][i];

            }
            for(int k = 0; k < n; k++){
                if(Arrays.equals(col, grid[k])){
                    count++;
                }
            }

        }
        return count;
    }
}
