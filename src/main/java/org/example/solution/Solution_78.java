package org.example.solution;

public class Solution_78 {
    public int solution(int n) {
        if (n == 0) return 0;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % 1234567;
            a = b;
            b = temp;
        }

        return b;
    }

    void main(){
        System.out.println(solution(10));
    }
}
