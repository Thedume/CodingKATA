package org.example.solution;

public class Solution_52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a){
            answer += (n / a) * b;

            n = (n / a) * b + n % a;
        }

        return answer;
    }

    public static void main(){
        Solution_52 sol = new Solution_52();

        System.out.println(sol.solution(3, 1, 20));
    }
}
