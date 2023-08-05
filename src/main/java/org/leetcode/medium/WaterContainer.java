package org.leetcode.medium;

public class WaterContainer {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{2,3,4,5,18,17,6}));

    }
    public static int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int maxArea = 0;
        while (p1!=p2){
            maxArea = Math.max(maxArea, Math.min(height[p1], height[p2])*(p2-p1));
            if(height[p1]>height[p2]){
                p2--;
            } else p1++;
        }
        return maxArea;
    }
}
