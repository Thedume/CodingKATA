package org.example.solution;

import java.util.Objects;

public class Solution_62 {
    public int solution(String[] babbling){
        int answer = 0;

        String[] words = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            int index = 0;
            String prev = "";

            while (index < s.length()) {
                boolean found = false;

                for (String word : words) {
                    if (s.startsWith(word, index) && !word.equals(prev)) {
                        index += word.length();
                        prev = word;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (index == s.length()) {
                answer++;
            }
        }

        return answer;
    }

    public void main(){
        String[] babbling = {"aya", "yee", "u", "maa"};

        System.out.println(solution(babbling));
    }
}
