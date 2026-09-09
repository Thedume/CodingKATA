package org.example.solution;

public class Solution_35 {
    public long solution(int price, int money, int count) {
        long total = (long) (count + 1) * price * count / 2;

        return Math.max(total - money, 0);
    }
}
