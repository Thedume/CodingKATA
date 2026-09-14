package org.example.solution;

public class Solution_44 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int c = 0, r = 0;

        for(int i = 0; i < sizes.length; i++){
            if (sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            System.out.println("size : "+sizes[i][0] + ", " + sizes[i][1]);

            if (sizes[i][0] > c) c = sizes[i][0];
            if (sizes[i][1] > r) r = sizes[i][1];

            System.out.println("cr : " + c + ", " + r);
        }

        System.out.println(c +":"+ r);
        answer = c * r;

        return answer;
    }

    public static void main(){
        Solution_44 sol = new Solution_44();
        int[][] num_1 = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        int[][] num_2 = {
                {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}
        };

        System.out.println(sol.solution(num_2));

    }

}

