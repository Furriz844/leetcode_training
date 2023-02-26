package org.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {
    private final List<Integer> stocks;
    private final Stack<int[]> stack;
    public StockSpanner() {
        stocks = new ArrayList<>();
        stack = new Stack<>();
    }

    public int next(int price) {
        //return byArrList(price);
        return byStack(price);
    }

    private int byStack(int price) {
        int counter = 1;
        while (!stack.isEmpty() && price >= stack.peek()[0]){
            counter+= stack.pop()[1];
        }
        stack.push(new int[]{price, counter});
        return counter;
    }

    private int byArrList(int price) {
        stocks.add(price);
        int counter = 0;
        for (int i = stocks.size()-1; i>= 0; i--){
            if(price >= stocks.get(i)){
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}
