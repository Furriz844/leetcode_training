package org.leetcode.easy;

import java.util.PriorityQueue;
import java.util.Queue;

public class RecentCounterMain {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1)); // 1
        System.out.println(counter.ping(100)); // 2
        System.out.println(counter.ping(3001)); // 3
        System.out.println(counter.ping(3002)); // 3
    }
    static class RecentCounter {
        private final Queue<Integer> requests;

        public RecentCounter() {
            requests = new PriorityQueue<>();
        }

        public int ping(int t) {
            int numOfRequests = 0;
            requests.offer(t);
            for (int current : requests) {
                int RANGE = 3000;
                if (current>=t- RANGE && current<=t){
                    numOfRequests++;
                }
            }
            return numOfRequests;
        }
    }
}
