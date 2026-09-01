package org.example.solution;
import java.util.Arrays;

class Solution_10 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
