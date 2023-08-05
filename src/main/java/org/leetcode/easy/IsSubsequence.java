package org.leetcode.easy;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
        System.out.println(isSubsequence("","ahbgdc"));
        System.out.println(isSubsequence("",""));
        System.out.println(isSubsequence("axc",""));
        System.out.println(isSubsequence("b","c"));
        System.out.println(isSubsequence("acb","ahbgdc"));



    }
    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int p1=0;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==s.charAt(p1)){
                p1++;
                if (p1 == s.length()){
                    return true;
                }
            }

        }
        return false;
    }
}
