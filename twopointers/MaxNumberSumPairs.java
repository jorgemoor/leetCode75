package twopointers;

import java.util.Arrays;

public class MaxNumberSumPairs {
    public static int mnsm(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= k) nums[i] = 0;
        }
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);
        int count = 0;
        while(l < r){
            if(nums[l] + nums[r] == k){
                count++;
                l++;
                r--;
            }else if(nums[l] + nums[r] < k) l++;
            else r--;


        }
        return count;
    }
}
