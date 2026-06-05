package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDifferenceTwoArrays {
    public List<List<Integer>> findDifferences(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(Arrays.asList(nums1[i], nums2[j]));
                i++;
                j++;

            }
        }
        return list;
    }
}
