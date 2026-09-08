package org.example.solution;

public class Solution_30 {
    public static String solution(String s) {
        int mid = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        } else {
            return s.substring(mid, mid + 1);
        }
    }

    public static void main(){
        System.out.println(solution("hello"));
    }
}
