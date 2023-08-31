package org.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDiffofArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6})); //[[1,3],[4,6]]
        System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2})); //[[3],[0]]

    }

    public static List<List<Integer>> optimal(int[] nums1, int[] nums2) {
        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return List.of(
                s1.stream().filter(e -> !s2.contains(e)).collect(Collectors.toList()),
                s2.stream().filter(e -> !s1.contains(e)).collect(Collectors.toList())
        );
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answers = new ArrayList<>();
        answers.add(find(nums1, nums2));
        answers.add(find(nums2, nums1));
        return answers;
    }

    public static List<Integer> find(int[] nums1, int[] nums2) {
        List<Integer> answer = new ArrayList<>();
        for (int j : nums1) {
            if (answer.contains(j)) continue;
            boolean flag = false;
            for (int k : nums2) {
                if (j == k) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer.add(j);
            }
        }
        return answer;
    }
}
