package org.leetcode.medium;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        //1,5,0,4,1,3
        System.out.println(increasingTriplet(new int[]{1,5,0,4,1,3}));
        //0,4,2,1,0,-1,-3
        System.out.println(increasingTriplet(new int[]{0,4,2,1,0,-1,-3}));

        //1,1,-2,6
        System.out.println(increasingTriplet(new int[]{1,1,-2,6}));

    }
    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= min) {
                min = n;
            } else if(n <= middle) {
                middle = n;
            } else return true;
        }
        return false;
    }
}
