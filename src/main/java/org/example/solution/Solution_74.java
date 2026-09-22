package org.example.solution;

import java.util.*;

public class Solution_74 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reportedCount = new HashMap<>();
        Map<String, Set<String>> reports = new HashMap<>();

        for (String id : id_list) {
            reports.put(id, new HashSet<>());
            reportedCount.put(id, 0);
        }

        for (String r : report) {
            String[] temp = r.split(" ");

            String reporter = temp[0];
            String target = temp[1];

            if (reports.get(reporter).add(target)) {
                reportedCount.put(
                        target,
                        reportedCount.get(target) + 1
                );
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {

            String reporter = id_list[i];

            for (String target : reports.get(reporter)) {
                if (reportedCount.get(target) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    void main(){
        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        System.out.print(Arrays.toString(solution(id_list, report, k)));
    }
}
