package org.example.solution;

import java.util.Arrays;

public class Solution_28 {

    public static int solution(int[] numbers){
        int answer = 45;

        for (int i : numbers)
            answer -= i;

        return answer;
    }

    public static void main(){
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
