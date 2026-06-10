package hashmap;

import java.util.*;

public class FindDifferenceTwoArrays {
    public static List<List<Integer>> findDifferences(int[] nums1, int[] nums2) {
        boolean[] n1 = new boolean[2001];
        boolean[] n2 = new boolean[2001];

        ArrayList<Integer> diff1 = new ArrayList<>();
        ArrayList<Integer> diff2 = new ArrayList<>();

        for(int num : nums1){
            n1[num + 1000] = true;
        }

        for(int num : nums2){
            n2[num + 1000] = true;

            if(!n1[num + 1000]){
                n1[num + 1000] = true;
                diff2.add(num);
            }
        }

        for(int num : nums1){
            if(!n2[num + 1000]){
                n2[num + 1000] = true;
                diff1.add(num);
            }
        }

        return List.of(diff1, diff2);

    }
}
