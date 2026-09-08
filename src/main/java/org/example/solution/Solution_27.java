package org.example.solution;

public class Solution_27 {
    public static String solution(String phone_number) {
        char[] answer = phone_number.toCharArray();
        int cnt = 0;
        for (int i = 0; i < phone_number.length() - 4; i++){
            answer[i] = '*';
        }
        return new String(answer);
    }

    public static void main(){
        System.out.println(solution("01071685101"));
    }
}
