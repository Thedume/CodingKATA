package org.example.solution;

public class Solution_75 {
    public String solution(String s){
        String[] num = s.split(" ");
        int min = 10000;
        int max = -10000;

        for (String n : num){
            int i = Integer.parseInt(n);

            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return String.format("%s %s", min, max);
    }

    void main(){
        String s = "-1 -1";

        System.out.print(solution(s));
    }

}
