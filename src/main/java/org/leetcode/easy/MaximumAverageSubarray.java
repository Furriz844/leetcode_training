package org.leetcode.easy;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage(new int[]{5}, 1));
        System.out.println(findMaxAverage(new int[]{-1}, 1));


    }
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum=-Double.MAX_VALUE;
        int left=0;
        int right=k;
        while (right<=nums.length){
            int sum=0;
            for (int i = left; i < right ; i++) {
                sum+=nums[i];
            }
            maxSum = Math.max(maxSum, sum);
            left++;
            right++;
        }
        return maxSum/k;
    }
    //optimal
    public static double findMaxAverageOptimal(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i ++)
            sum += nums[i];
        int maxSum = sum;
        for(int i = k; i < nums.length; i ++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
}
