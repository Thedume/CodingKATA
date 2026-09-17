package org.example.solution;

public class Solution_58 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if (isDecimal(nums[i] + nums[j] + nums[k])){
                        //System.out.println("i : " + nums[i] + ", j : " + nums[j] + ", k : " + nums[k]);
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isDecimal(int n){
        if (n == 0 || n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }

        return true;
    }

    public void main(){
        int[] num = {1,2,3,4};

        System.out.println(solution(num));
    }
}
