package org.leetcode.medium;
public class LongestSubarrayAfterDeletingOneEl {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,1,0,1})); //3
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1})); //5
        System.out.println(longestSubarray(new int[]{1,1,1})); //2

    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        int counter = 0;
        int zeros = 0;

        while(right<nums.length){
            if(nums[right]==1){
                counter++;
            }
            if(nums[right]==0){
                zeros++;
            }
            if(zeros<=1 && nums[right] == 0){
                counter++;
            }
            if (zeros>1){
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
        return max-1;
    }
}
