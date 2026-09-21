package org.example.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution_68 {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> burger = new ArrayList<>();

        for (int x : ingredient){
            burger.add(x);

            int size = burger.size();

            if (size >= 4 &&
                burger.get(size-4) == 1 &&
                burger.get(size-3) == 2 &&
                burger.get(size-2) == 3 &&
                burger.get(size-1) == 1
            ) {
                answer++;

                for (int i = 0; i < 4; i++)
                    burger.removeLast();
            }
        }

        return answer;
    }

    void main(){
        int[] i = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.print(solution(i));
    }
}
