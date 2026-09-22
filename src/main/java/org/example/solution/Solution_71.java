package org.example.solution;


import java.util.*;

public class Solution_71 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> term = new HashMap<>();

        for (String t : terms) {
            String[] temp = t.split(" ");

            String type = temp[0];
            int month = Integer.parseInt(temp[1]);

            term.put(type, month);
        }

        int todayDate = dateToDay(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");

            String date = temp[0];
            String type = temp[1];

            int expirationDate = dateToDay(date) + term.get(type) * 28;

            if (todayDate >= expirationDate) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int dateToDay(String date) {
        String[] temp = date.split("\\.");

        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);

        return year * 12 * 28 + month * 28 + day;
    }

    void main(){
        String today = "2022.05.19";
        String[] terms = { "A 6", "B 12", "C 3" };
        String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

        System.out.print(Arrays.toString(solution(today, terms, privacies)));
    }
}
