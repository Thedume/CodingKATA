package org.example.solution;

public class Solution_41 {
    public String solution(String s) {
        char[] answer = s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < s.length(); i++){
            if (answer[i] == ' ') {
                cnt = 0;
                continue;
            }

            if (cnt % 2 == 0)
                answer[i] = Character.toUpperCase(answer[i]);

            cnt++;
        }

        return String.valueOf(answer);
    }

    public static void main(){
        Solution_41 sol = new Solution_41();

        System.out.println(sol.solution("try hello world"));
    }
}
