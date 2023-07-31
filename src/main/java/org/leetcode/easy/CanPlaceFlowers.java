package org.leetcode.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(prev==0 && flowerbed[i]==0 && (i+1== flowerbed.length || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
            prev = flowerbed[i];
        }
        return n<0;
    }
}
