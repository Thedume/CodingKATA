package org.example.solution;

import java.util.Arrays;

public class Solution_77 {
    public int[] solution(String s){
        int count = 0;
        int zero = 0;

        while (!s.equals("1")) {

            int length = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    length++;
                }
            }

            s = Integer.toBinaryString(length);
            count++;
        }

        return new int[]{count, zero};
    }

    void main(){
        String s = "110010101001";

        System.out.println(Arrays.toString(solution(s)));
    }
}
