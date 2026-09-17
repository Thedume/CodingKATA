package org.example.solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_57 {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++){
            if (answers[i] == first[i % first.length])
                score[0]++;
            if (answers[i] == second[i % second.length])
                score[1]++;
            if (answers[i] == third[i % third.length])
                score[2]++;
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));

        for (int i = 0; i < score.length; i++){
            if (score[i] == max)
                answer.add(i+1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public void main(){
        int[] ans = {1,3,2,4,2};

        System.out.println(Arrays.toString(solution(ans)));
    }
}
