package org.leetcode.medium;

import java.util.Stack;

/*
You are given a string s, which contains stars *.

In one operation, you can:

    Choose a star in s.
    Remove the closest non-star character to its left, as well as remove the star itself.

Return the string after all stars have been removed.

Note:

    The input will be generated such that the operation is always possible.
    It can be shown that the resulting string will always be unique.

 */
public class RemoveStarsFromString {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e")); //"lecoe"
        System.out.println(removeStars("erase*****")); //""

    }
    public static String removeStars(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*'){
                charStack.pop();
            } else {
                charStack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!charStack.empty()) {
            sb.insert(0, charStack.pop());
        }
        return sb.toString();
    }
}
