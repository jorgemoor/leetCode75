package slidingwindow;

public class LongestSubarrayDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int start = 0;
        int ind = -1;
        int len = 0;
        int end = 0;

        while(end < nums.length){
            if(nums[end] == 0){
                if(ind != -1){
                    len = Math.max(len, end-start - 1);
                    start = ind+1;
                }
                ind = end;

            }
            end++;
        }
        return Math.max(len, end-start - 1);
    }
}
