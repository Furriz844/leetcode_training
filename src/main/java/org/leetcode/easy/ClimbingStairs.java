package org.leetcode.easy;

public class ClimbingStairs {
    private final int[] answers = new int[45];
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        if(answers[n-1]!=0){
            return answers[n-1];
        }
        int counter = 0;

        if(n==1){
            return 1;
        }
        if (n==2) {
            return 2;
        }
        counter+=climbStairs(n-1)+climbStairs(n-2);
        answers[n-1]=counter;
        return counter;
    }
}
