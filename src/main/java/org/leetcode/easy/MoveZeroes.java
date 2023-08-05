package org.leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{1, 0, 0, 0, 0});
        moveZeroes(new int[]{1, 0, 0, 0, 1});
        moveZeroes(new int[]{1, 2, 3, 4, 5});


    }

    public static void moveZeroes(int[] nums) {
        int nz = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int p = i;
                while (p > nz) {
                    nums[p - 1] = nums[p];
                    nums[p] = 0;
                    p--;
                }
                nz = p + 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
