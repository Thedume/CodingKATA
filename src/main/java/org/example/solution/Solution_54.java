package org.example.solution;

public class Solution_54 {
    public String solution(int a, int b){
        String answer = "";
        String[] days = {"SAT", "SUN","MON","TUE","WED","THU","FRI"};
        int[] month = {0, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        int index = 26;

        if (a == 1 || a == 2) index--;

        System.out.println(index + b + month[a]);
        System.out.println((index + b + month[a]) % 7);

        return days[(index + b + month[a]) % 7];
    }

    public static void main(){
        Solution_54 sol = new Solution_54();

        System.out.println(sol.solution(5, 24));
    }
}
