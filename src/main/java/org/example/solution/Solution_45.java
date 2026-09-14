package org.example.solution;

public class Solution_45 {
    public String solution(String s, int n) {
        String answer = "";

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += ' ';
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                c = (char)(c + n);

                if (c > 'z')
                    c -= 26;
            } else if (c >= 'A' && c <= 'Z') {
                c = (char)(c + n);

                if (c > 'Z')
                    c -= 26;
            }

            answer += c;
        }

        return answer;
    }

    public static void main(){
        Solution_45 sol = new Solution_45();

        System.out.println(sol.solution("a B z", 4));
    }
}
