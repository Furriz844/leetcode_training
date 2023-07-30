package org.leetcode.easy;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc", "pqr"));
        System.out.println(solution.mergeAlternately("ab", "pqrs"));
        System.out.println(solution.mergeAlternately("abcd", "pq"));

    }
    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            int i = 0;
            int j = 0;
            StringBuilder result = new StringBuilder("");
            while(i< word1.length() || j<word2.length()){
                if( i< word1.length()){
                    result.append(word1.charAt(i));
                }
                if( j< word2.length()){
                    result.append(word2.charAt(j));
                }
                i++;
                j++;
            }
            return result.toString();
        }
    }
}
