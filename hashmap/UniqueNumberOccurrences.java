package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOccurrences {
    public static boolean isUnique(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int value : map.values()){
            set.add(value);
        }

        return map.size() == set.size();
    }
}
