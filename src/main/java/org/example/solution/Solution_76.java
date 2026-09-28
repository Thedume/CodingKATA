package org.example.solution;

public class Solution_76 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        boolean first = true;

        for (char c : s.toCharArray()) {

            if (c == ' ') {
                answer.append(c);
                first = true;
            } else {
                if (first) {
                    answer.append(Character.toUpperCase(c));
                    first = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }

        return answer.toString();
    }

    void main(){
        String s = "3people unFollowed me";

        System.out.println(solution(s));
    }
}
