package org.leetcode.easy;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6})); //3
        System.out.println(pivotIndex(new int[]{1,2,3})); //-1
        System.out.println(pivotIndex(new int[]{2,1,-1})); //0

    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int minus = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            sum-=nums[i];
            if(sum==minus) return i;
            minus+=nums[i];
        }
        return -1;
    }
}
