package twopointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void mz(int[] nums){
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
