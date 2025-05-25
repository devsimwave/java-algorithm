package programmers.level0.몫구하기;

public class Solution {

    public static void main(String[] args) {
        
        Solution a = new Solution();

        System.out.println(a.solution(0, 0));
        

    }


    public int solution(int num1, int num2) {
        
        int answer = num1 / num2;
        return answer;
    }
    
}
