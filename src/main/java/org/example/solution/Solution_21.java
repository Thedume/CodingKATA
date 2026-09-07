package org.example.solution;

public class Solution_21 {
    public boolean solution(int x) {
        int answer = 0;
        int n = x;

        while (x > 0) {
            answer += x % 10;
            x /= 10;
        }

        if (n % answer == 0) return true;
        else return false;

        //return answer;
    }
}
