package org.example.solution;

import java.util.Arrays;

public class Solution_73 {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {

            String[] command = route.split(" ");

            char direction = command[0].charAt(0);
            int distance = Integer.parseInt(command[1]);

            int nx = x;
            int ny = y;

            for (int i = 0; i < distance; i++) {

                if (direction == 'N') nx--;
                else if (direction == 'S') nx++;
                else if (direction == 'W') ny--;
                else if (direction == 'E') ny++;

                if (nx < 0 || nx >= park.length ||
                        ny < 0 || ny >= park[0].length() ||
                        park[nx].charAt(ny) == 'X') {

                    nx = x;
                    ny = y;
                    break;
                }
            }

            x = nx;
            y = ny;
        }

        return new int[]{x, y};
    }

    void main(){
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        System.out.print(Arrays.toString(solution(park, routes)));
    }
}
