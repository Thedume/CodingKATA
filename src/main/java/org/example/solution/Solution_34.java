package org.example.solution;

import java.util.Arrays;

public class Solution_34 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        String reverseStr = new StringBuilder(new String(charArr)).reverse().toString();

        return reverseStr;
    }
}
