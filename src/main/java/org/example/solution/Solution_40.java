package org.example.solution;

public class Solution_40 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer = answer * 3 + n % 3;
            n /= 3;
        }

        return answer;
    }

    public void main(){
        Solution_40 sol = new Solution_40();

        System.out.print(sol.solution(45));
    }
}
