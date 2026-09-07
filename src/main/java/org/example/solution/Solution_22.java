package org.example.solution;

public class Solution_22 {
    public long solution(int a, int b) {
        long answer;

        if (b > a)
            answer = (((long) b * (b + 1)) - ((long) a * (a - 1))) / 2;
        else
            answer = (((long) a * (a + 1)) - ((long) b * (b - 1))) / 2;

        return answer;
    }
}
