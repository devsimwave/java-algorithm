package programmers.level2.카펫;

import java.util.Scanner;

// 다시 풀어볼것
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();
        long startTime = System.currentTimeMillis();
        Solution solution = new Solution();
        System.out.println(solution.solution(brown, yellow));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }

    /*
        1.	전체 격자 수를 구함: total = brown + yellow
        2.	가능한 모든 세로(height)를 3 이상부터 total까지 반복
        3.	width = total / height 가 나누어 떨어질 때만 체크
        4.	그때 (width - 2) * (height - 2) == yellow 라면 정답
        
    */ 
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for(int height = 3; height <= total; height++) {
            if(total % height != 0) continue;
            int width = total / height;
            if(((width -2) * (height - 2)) == yellow) {
                return new int[] {width, height};
            } 
        }
        return null;
    }
}
