package org.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5}))); // [5,10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8, -8}))); // []
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5}))); // [10]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{1, 3, -5}))); // [-5]
        System.out.println(Arrays.toString(asteroidCollision(new int[]{-3, -4, 10}))); // [-3, -4, 10]


    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int i:asteroids){
            if(stack.isEmpty() || i>0){
                stack.add(i);
            }
            else{
                while(true){
                    int peek=stack.peek();
                    if(peek<0){
                        stack.add(i);
                        break;
                    }
                    else if(peek== -i){
                        stack.pop();
                        break;
                    }
                    else if(peek > -i){
                        break;
                    }
                    else{
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.add(i);
                            break;
                        }
                    }
                }
            }
        }
        int []ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}
