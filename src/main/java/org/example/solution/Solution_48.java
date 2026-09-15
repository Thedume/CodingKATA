package org.example.solution;

import java.util.Arrays;

public class Solution_48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, start - 1, end);

            Arrays.sort(temp);

            answer[i] = temp[k - 1];
        }

        return answer;
    }

    public static void main(){
        Solution_48 sol = new Solution_48();


    }
}
