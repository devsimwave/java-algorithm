package programmers.level2.숫자의_표현;

import java.util.Scanner;

// TODO: 힌트 보고 푼거라 다시 풀어볼것
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        System.out.println(solution.solution(a));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; j <= n; j++) {
                sum += j;
                if(sum == n) {
                    answer += 1;
                    break;
                } else if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
