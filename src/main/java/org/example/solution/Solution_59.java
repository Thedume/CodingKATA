package org.example.solution;

public class Solution_59 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] paint = new int[n];
        for (int i : section){
            paint[i-1] = 1;
        }

        for (int i = 0; i < n; i++){
            if (paint[i] == 1){
                int check = Math.min((i + m), n);
                for (int j = i; j < check; j++){
                    paint[j] = 0;
                }
                answer++;
            }
        }

        return answer;
    }

    public void main(){
        int n = 4;
        int m = 1;
        int[] section = {1,2, 3, 4};

        System.out.println(solution(n, m, section));
    }
}
