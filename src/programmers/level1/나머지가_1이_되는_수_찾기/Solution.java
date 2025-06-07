package programmers.level1.나머지가_1이_되는_수_찾기;

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
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            } 
        }
        return answer;
    }
}
