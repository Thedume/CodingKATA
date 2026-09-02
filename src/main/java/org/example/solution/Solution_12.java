package org.example.solution;

import java.util.Arrays;

public class Solution_12 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
