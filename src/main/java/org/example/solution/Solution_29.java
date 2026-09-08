package org.example.solution;

import java.util.Arrays;

public class Solution_29 {
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr)
                .filter(n -> n != min)
                .toArray();
    }

    public static void main(){
        System.out.println(solution(new int[]{4, 3, 2, 1}));
    }
}
