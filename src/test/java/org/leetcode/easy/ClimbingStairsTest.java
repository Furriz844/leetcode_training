package org.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    ClimbingStairs stairs = new ClimbingStairs();
    @Test
    void climbStairs() {
        assertEquals(2,stairs.climbStairs(2));
        assertEquals(3,stairs.climbStairs(3));
        assertEquals(1,stairs.climbStairs(1));
        assertEquals(0,stairs.climbStairs(0));
        assertEquals(13,stairs.climbStairs(6));
    }
}