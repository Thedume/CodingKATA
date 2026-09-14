package org.example.solution;

public class Solution_43 {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num = Long.parseLong(
                    t.substring(i, i + p.length())
            );

            if (num <= target) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(){
        Solution_43 sol = new Solution_43();

        System.out.println(sol.solution("3141592", "271"));
    }
}
