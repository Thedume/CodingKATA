package org.example.solution;

import java.util.Arrays;

public class Solution_64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 1];

        Arrays.fill(clothes, 1);

        for (int student : lost) {
            clothes[student]--;
        }

        for (int student : reserve) {
            clothes[student]++;
        }

        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 0) {

                if (i > 1 && clothes[i - 1] == 2) {
                    clothes[i - 1]--;
                    clothes[i]++;
                }
                else if (i < n && clothes[i + 1] == 2) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }

    public void main(){
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));
    }
}
