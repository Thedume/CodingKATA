package org.example.solution;

import java.util.Arrays;

public class Solution_47 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        String temp;

        for (int i = strings.length - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                char[] f = strings[j].toCharArray();
                char[] s = strings[j+1].toCharArray();

                //System.out.println("f: " + f[n] + ", s: " + s[n]);

                if (f[n] > s[n]){
                    temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
                else if (f[n] == s[n]){
                    if (strings[j].compareTo(strings[j+1]) > 0){
                        temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                    else continue;
                }
            }
        }

        return strings;
    }

    public static void main(){
        Solution_47 sol = new Solution_47();
        String[] s = {
                "abce",
                "abcd",
                "cdx"
        };

        System.out.println(Arrays.toString(sol.solution(s, 2)));
    }
}
