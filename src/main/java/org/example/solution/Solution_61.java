package org.example.solution;

import java.util.Arrays;

public class Solution_61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6, 6, 5, 4, 3, 2, 1};
        int cnt = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++){
            if (lottos[i] == 0){
                zero++;
            }
            else {
                for(int j = 0; j < win_nums.length; j++){
                    if (lottos[i] == win_nums[j])
                        cnt++;
                }
            }
        }

        return new int[]{answer[cnt+zero], answer[cnt]};
    }

    public void main(){
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }
}
