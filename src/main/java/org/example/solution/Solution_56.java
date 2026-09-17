package org.example.solution;

import java.util.Arrays;

public class Solution_56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int n = score.length / m;

        for (int i = score.length % m; i < score.length; i += m){
            int[] box = Arrays.copyOfRange(score, i, i + m);
            int min = Arrays.stream(box).min().getAsInt();
            System.out.println(min * m);
            answer += min * m;
        }

        return answer;
    }

    public void main(){
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(solution(4, 3, score));
    }
}
