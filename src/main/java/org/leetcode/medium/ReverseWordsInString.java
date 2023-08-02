package org.leetcode.medium;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String trimmed = s.trim();
        String[] words = trimmed.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length-1; i >= 0 ; i--) {
            if (words[i].equals("")) continue;
            reversed.append(words[i]);
            if (i!=0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
