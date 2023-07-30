package org.leetcode.easy;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));


    }
    public static String gcdOfStrings(String str1, String str2) {
        //check if concatenation is equal for both string so str2 is substring of str1
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        return str2.substring(0, gcd(str1.length(), str2.length()));
    }
    //find the greatest common divisor for lengths of strings
    private static int gcd(int a, int b){
        return b==0 ? a : gcd(b, a % b);
    }
}
