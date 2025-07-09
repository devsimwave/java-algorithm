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
