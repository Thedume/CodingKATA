package org.example.solution;

import java.util.Arrays;

public class Solution_20 {
    public long solution(long n) {
        String str = String.valueOf(n);

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return Long.parseLong(sb.reverse().toString());
    }
}
