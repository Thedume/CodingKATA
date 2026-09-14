package org.example.solution;

public class Solution_42 {
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++){
            for (int j = i+1; j < number.length; j++){
                for (int k = j+1; k < number.length; k++){
                    if ((number[i] + number[j] + number[k]) == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(){
        Solution_42 sol = new Solution_42();
        int[] num = {-2, 3, 0, 2, -5};

        System.out.println(sol.solution(num));
    }
}
