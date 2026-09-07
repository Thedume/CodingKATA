package org.example.solution;

public class Solution_24 {
    public String solution(String[] seoul) {
        int cnt = 0;
        for (String s : seoul){
            if (s.equals("Kim")) break;
            else cnt++;
        }

        String answer = String.format("김서방은 %d에 있다", cnt);
        return answer;
    }
}
