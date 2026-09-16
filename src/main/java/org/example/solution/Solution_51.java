package org.example.solution;

public class Solution_51 {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;

            left.append(String.valueOf(i).repeat(count));
        }

        String right = new StringBuilder(left).reverse().toString();

        return left + "0" + right;
    }

    public static void main(){
        Solution_51 sol = new Solution_51();
        int[] food = { 1, 7, 1, 2};

        System.out.println(sol.solution(food));

    }
}
