package org.example.solution;

public class Solution_67 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char str : s.toCharArray()){
            int count = 0;

            while (count < index){
                str++;

                if (str > 'z')
                    str = 'a';

                if (skip.indexOf(str) == -1)
                    count++;
            }

            answer.append(str);
        }

        return answer.toString();
    }

    public void main(){
        String s= "aukks";
        String skip = "wbqd";
        int index = 5;

        System.out.print(solution(s, skip, index));
    }
}
