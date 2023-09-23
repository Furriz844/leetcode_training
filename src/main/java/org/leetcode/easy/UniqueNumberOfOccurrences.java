package org.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3})); //true
        System.out.println(uniqueOccurrences(new int[]{1,2})); //false
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0})); //true

    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> uniqueNumbersMap = new HashMap<>();
        for (int element: arr) {
            if(uniqueNumbersMap.containsKey(element)){
                uniqueNumbersMap.put(element, uniqueNumbersMap.get(element)+1);
            } else {
                uniqueNumbersMap.put(element, 1);
            }
        }
        Set<Integer> uniqueNumbersSet = new HashSet<>(uniqueNumbersMap.values());
        return uniqueNumbersMap.size() == uniqueNumbersSet.size();
    }
}
