package twopointers;

public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n - 1;

        while (left < right){
            int min = Math.min(height[left], height[right]);
            int area = Math.abs(left - right) * min;

            if (area > max) max = area;

            while(left < right && height[left] <= min) left++;
            while (left < right && height[right] <= min) right--;
        }

        return max;
    }
}
