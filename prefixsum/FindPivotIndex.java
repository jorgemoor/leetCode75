package prefixsum;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums){
        int l = 0, r = 0;
        int ult = nums.length - 1;
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i - 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0) l = 0;
            else l = nums[i - 1];
            r = nums[ult] - nums[i];
            if(l == r) return i;

        }
        return -1;
    }
}
