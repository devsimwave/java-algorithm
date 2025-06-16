package programmers.level2.최솟값_만들기;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int a[] = {1,4,2};
        int b[] = {5,4,4};
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        System.out.println(solution.solution(a, b));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
    }

    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}
