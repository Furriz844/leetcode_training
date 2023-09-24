package org.leetcode.medium;

import java.util.Arrays;

public class RowAndColumnPairs {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3,2,1}, {1,7,6}, {2,7,7}})); //1
        System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}})); //3
    }

    public static int equalPairs(int[][] grid) {
        int counter = 0;
        for (int[] currentRow : grid) {
            for (int column = 0; column < grid.length; column++) {
                int[] currentColumn = new int[grid.length];
                for (int row = 0; row < grid[column].length; row++) {
                    currentColumn[row] = grid[row][column];
                }
                if (Arrays.equals(currentRow, currentColumn)) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
