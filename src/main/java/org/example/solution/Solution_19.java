package org.example.solution;

public class Solution_19 {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }

        return -1;
    }
}
