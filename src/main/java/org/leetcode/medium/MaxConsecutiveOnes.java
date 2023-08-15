package org.leetcode.medium;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(longestOnes(new int[]{1,0}, 0));


    }
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int counter = 0;

        while (right < nums.length){
            if(nums[right]==1){
                counter++;
            }
            if (nums[right]==0){
                zeros++;
            }
            if(zeros<=k && nums[right] == 0){
                counter++;
            }
            if (zeros>k){
                if(nums[left]==1){
                    counter--;
                }
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            right++;
            max = Math.max(counter, max);
        }
        return max;
    }
}
