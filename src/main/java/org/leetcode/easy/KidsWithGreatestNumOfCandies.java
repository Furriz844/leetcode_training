package org.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumOfCandies {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>  greatestCandies= new ArrayList<>();
        int max = 0;
        for (int candy: candies) {
            if (candy > max)
                max = candy;
        }
        for (int candy: candies) {
            greatestCandies.add(candy + extraCandies >= max);
        }

        return greatestCandies;
    }
}
