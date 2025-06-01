package programmers.level1.x만큼_간격이_있는_n개의_숫자;

import java.util.Scanner;

// 다른 코드 풀어볼것
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();


        Solution solution = new Solution();
        System.out.println(solution.solution(x, y)); 

    }

    
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 1; i <= answer.length; i++) {
            answer[i - 1] += (long) x * i;         // 테스트 케이스 13, 14번 int max값을 초과하는 케이스라 long으로 캐스팅 해줘야 함
        }

        return answer;
    }
}
