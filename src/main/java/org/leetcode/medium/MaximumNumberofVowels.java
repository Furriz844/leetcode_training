package org.leetcode.medium;

import java.util.List;

public class MaximumNumberofVowels {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("weallloveyou", 7));
        System.out.println(maxVowels("tryhard", 4));




    }
    private static final List<Character> vowels = List.of('a','e', 'i', 'o', 'u');
    public static int maxVowels(String s, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))){
                max++;
            }
        }
        int left = 0;
        int counter = max;
        while (k+left<s.length()){
            if(vowels.contains(s.charAt(left))){
                counter--;
            }
            if(vowels.contains(s.charAt(k+left))){
                counter++;
            }
            left++;
            max = Math.max(counter, max);
        }
        return max;
    }
}
