package org.example.solution;

public class Solution_63 {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        char[] char_X = X.toCharArray();
        char[] char_Y = Y.toCharArray();
        int[] index_X = new int[10];
        int[] index_Y = new int[10];

        for (char s : char_X){
            index_X[s - '0']++;
        }

        for (char s : char_Y){
            index_Y[s - '0']++;
        }

        for (int i = 9; i >= 0; i--){
            int count = Math.min(index_X[i], index_Y[i]);

            answer.append(String.valueOf(i).repeat(count));
        }

        return answer.toString();
    }

    public void main(){
        String x = "100";
        String y = "123450";

        System.out.println(solution(x, y));
    }
}
