package org.example.solution;

public class Solution_65 {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int different = 0;
        char first = ' ';

        for (int i = 0; i < s.length(); i++) {

            if (same == 0 && different == 0) {
                first = s.charAt(i);
            }

            if (s.charAt(i) == first) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                answer++;
                same = 0;
                different = 0;
            }
        }

        // 마지막 남은 부분
        if (same != 0 || different != 0) {
            answer++;
        }

        return answer;
    }

    public void main(){
        String s = "aaabb";

        System.out.print(solution(s));
    }
}
