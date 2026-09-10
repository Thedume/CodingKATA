package org.example.solution;

public class Solution_36 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    public void main(){
        Solution_36 sol = new Solution_36();

        System.out.println(sol.solution("a234"));
    }
}
