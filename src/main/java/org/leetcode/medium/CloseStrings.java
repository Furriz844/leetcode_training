package org.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class CloseStrings {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca")); //true
        System.out.println(closeStrings("a", "aa")); //false
        System.out.println(closeStrings("cabbba", "abbccc")); //true
        System.out.println(closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff")); //false
    }
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }
        Map<Character, Integer> word1Map = getCharMap(word1);
        Map<Character, Integer> word2Map = getCharMap(word2);
        ArrayList<Integer> word1Values = word1Map.values().stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> word2Values = word2Map.values().stream().sorted().collect(Collectors.toCollection(ArrayList::new));

        return word1Map.keySet().equals(word2Map.keySet()) && word1Values.equals(word2Values);
    }

    private static Map<Character, Integer> getCharMap(String word1) {
        Map<Character, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            Character element = word1.charAt(i);
            if(wordMap.containsKey(element)){
                wordMap.put(element, wordMap.get(element)+1);
            } else {
                wordMap.put(element, 1);
            }
        }
        return wordMap;
    }
}
