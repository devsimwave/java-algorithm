package programmers.level1.자릿수_더하기;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
        sc.close();
    }

    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i + 1));            
        }
        return answer;
    }
}
