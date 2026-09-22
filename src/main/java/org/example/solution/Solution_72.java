package org.example.solution;

import java.util.Arrays;
import java.util.HashMap;

public class Solution_72 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {

            int index = map.get(calling);

            String front = players[index - 1];

            players[index - 1] = calling;
            players[index] = front;

            map.put(calling, index - 1);
            map.put(front, index);
        }

        return players;
    }

    void main(){
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));
    }
}
