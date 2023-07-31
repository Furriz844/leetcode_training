package org.leetcode.easy;

import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));

    }
    public static String reverseVowels(String s) {
        StringBuilder answer = new StringBuilder(s);
        int j = s.length()-1;
        char temp;
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))){
                while (!vowels.contains(Character.toLowerCase(s.charAt(j)))){
                    j--;
                }
                temp = s.charAt(i);
                answer.setCharAt(i, s.charAt(j));
                answer.setCharAt(j, temp);
                j--;
            }
            if (i+1==j) break;
        }
        return answer.toString();
    }
}
