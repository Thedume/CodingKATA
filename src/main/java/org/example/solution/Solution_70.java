package org.example.solution;

import java.util.Arrays;

public class Solution_70 {
    public int[] solution(String[] wallpaper) {
        int minY = wallpaper[0].length(), minX = wallpaper.length;
        int maxY = 0, maxX = 0;
        int indexX = 0, indexY = 0;


        for (String str : wallpaper){
            for (char s : str.toCharArray()){
                if (s == '#'){
                    minY = Math.min(minY, indexY);
                    minX = Math.min(minX, indexX);

                    maxX = Math.max(maxX, indexX);
                    maxY = Math.max(maxY, indexY);
                }

                indexY++;
            }
            indexX++;
            indexY = 0;
        }

        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }

    void main(){
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

        System.out.print(Arrays.toString(solution(wallpaper)));
    }
}
