package org.example.solution;

public class Solution_69 {
    public String solution(String[] survey, int[] choices) {
        int[] score = new int[26];

        for (int i = 0; i < survey.length; i++) {
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            int choice = choices[i];

            if (choice < 4) {
                score[first - 'A'] += 4 - choice;
            }
            else if (choice > 4) {
                score[second - 'A'] += choice - 4;
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(score['R' - 'A'] >= score['T' - 'A'] ? 'R' : 'T');
        answer.append(score['C' - 'A'] >= score['F' - 'A'] ? 'C' : 'F');
        answer.append(score['J' - 'A'] >= score['M' - 'A'] ? 'J' : 'M');
        answer.append(score['A' - 'A'] >= score['N' - 'A'] ? 'A' : 'N');

        return answer.toString();
    }

    void main(){
        String[] survey = {"AN", "CF", "MJ", "RT", "NA" };
        int[] choices = { 5, 3, 2, 7, 5};

        System.out.println(solution(survey, choices));
    }
}
