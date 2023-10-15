package org.leetcode.medium;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); //aaabcbc
        System.out.println(decodeString("3[a2[c]]")); //accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef")); //abcabccdcdcdef
        System.out.println(decodeString("100[leetcode]"));

    }

    public static String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<StringBuilder> ss = new Stack<>();

        int num = 0;
        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                num = (num * 10) + Character.getNumericValue(ch);
            } else if (ch == '[') {
                ss.push(str);
                str = new StringBuilder();

                is.push(num);
                num = 0;
            } else if (ch == ']') {
                StringBuilder temp = str;
                str = ss.pop();
                int count = is.pop();
                String tempString = temp.toString();
                str.append(tempString.repeat(count));

            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
