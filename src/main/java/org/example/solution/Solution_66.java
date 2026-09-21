package org.example.solution;

import java.util.Arrays;

public class Solution_66 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int index = 0;

        for(String target : targets){
            int total = 0;

            for (char targetChar: target.toCharArray()){
                int min = 100;

                for (String key : keymap){
                    int press = key.indexOf(targetChar);

                    if (press != -1){
                        min = Math.min(min, press+1);
                    }
                }

                if (min == 100){
                    total = -1;
                    break;
                }

                total += min;
            }

            answer[index++] = total;
        }

        return answer;
    }

    public void main(){
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}
