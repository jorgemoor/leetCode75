package slidingwindow;

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k){
        int izq = 0;
        int ceros = 0;
        int maxCount = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 0) ceros++;

            while(ceros > k){
                if(nums[izq] == 0) ceros--;
                izq++;
            }
            maxCount = Math.max(maxCount, j - izq + 1);
        }
        return maxCount;
    }
}
