package org.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DailyTempTest {

    private final DailyTemp dailyTemp = new DailyTemp();
    @ParameterizedTest
    @MethodSource("temperatures")
    void dailyTemperatures(int[] temps, int[] ans) {
        assertArrayEquals(ans, dailyTemp.dailyTemperatures(temps));
    }

    public static Stream<Arguments> temperatures() {
        return Stream.of(
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0}),
                Arguments.of(new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}));
    }
}