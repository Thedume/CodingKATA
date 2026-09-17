package org.example.solution;

public class Solution_60 {
    public int solution(int number, int limit, int power){
        int answer = 0;

        for (int i = 1; i <= number; i++){
            answer += (checkAttack(i) > limit) ? power : checkAttack(i);
        }

        return answer;
    }

    public int checkAttack(int n){
        int cnt = 0;
        for (int i = 1; i * i <= n; i++){
            if (n % i == 0) {
                cnt++;
                if (i != n / i) cnt++;
            }
        }

        return cnt;
    }

    public void main(){
        System.out.println(solution(5, 3, 2));
    }
}
