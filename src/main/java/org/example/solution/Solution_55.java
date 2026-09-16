package org.example.solution;

public class Solution_55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1 = 0, index2 = 0;

        for (String s : goal){
            if (index1 < cards1.length && cards1[index1].equals(s)){
                index1++;
            }
            else if (index2 < cards2.length && cards2[index2].equals(s)){
                index2++;
            }
            else return "No";
        }

        return "Yes";
    }

    public static void main(){
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        Solution_55 sol = new Solution_55();

        System.out.println(sol.solution(cards1, cards2, goal));
    }
}
