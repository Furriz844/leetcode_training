package org.leetcode.medium;

import java.util.Arrays;

public class MaxNumberOfKPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3}, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        int counter=0;
        int left =0;
        int right = nums.length-1;
        Arrays.sort(nums);
        while (left<right){
            int sum = nums[left] + nums[right];
            if (sum==k){
                counter++;
                left++;
                right--;
                continue;
            }
            if (sum>k){
                right--;
            } else left++;
        }

        return counter;
    }
}
