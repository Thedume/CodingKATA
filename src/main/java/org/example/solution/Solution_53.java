package org.example.solution;

import java.util.*;

public class Solution_53 {
    public int[] solution(int k, int[] score){
        int[] answer = new int[score.length];

        List<Integer> hall = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {

            hall.add(score[i]);

            Collections.sort(hall, Collections.reverseOrder());

            if (hall.size() > k) {
                hall.remove(k);
            }

            answer[i] = hall.get(hall.size() - 1);
        }

        return answer;
    }

    public static void main(){
        Solution_53 sol = new Solution_53();
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(sol.solution(3, score));
    }

}
