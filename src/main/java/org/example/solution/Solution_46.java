package org.example.solution;

public class Solution_46 {
    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < num.length; i++)
            s = s.replace(num[i], String.valueOf(i));

        return Integer.parseInt(s);
    }
}
