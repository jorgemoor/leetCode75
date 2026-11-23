package arraystring;


import java.util.*;
import java.util.List;

public class kidsWithCandies {
    public static List<Boolean> kwc(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int candy : candies) {
            result.add(candy+extraCandies>=max);
        }
        return result;
    }
}
