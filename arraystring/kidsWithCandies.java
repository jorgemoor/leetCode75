package arraystring;


import java.util.*;
import java.util.List;

public class kidsWithCandies {
    public static List<Boolean> kwc(int[] candies, int extraCadies){
        List<Boolean> result = new ArrayList<>();

        int max = Arrays.stream(candies).max().getAsInt();
        for(int candy :  candies){
            result.add(candy + extraCadies >= max);
        }
        return result;
    }
}
