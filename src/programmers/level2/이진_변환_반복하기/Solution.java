package programmers.level2.이진_변환_반복하기;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long startTime = System.currentTimeMillis();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }

    public int[] solution(String s) {
        String binary = s;
        int count = 0;
        int zeroCount = 0;
        while(binary.length() > 1) {
            // 문자열 길이
            int len = binary.length();
            // 0 제거 갯수
            int zero = (int) binary.chars().filter(i -> i == '0').count();
            // 0 제거 갯수를 더한다
            zeroCount += zero;
            count++;
            // 0제거한 문자열을 이진법으로 전환
            binary = Integer.toBinaryString(len - zero);
        }
        return new int[] {count, zeroCount};
    }
}
