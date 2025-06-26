package programmers.level2.JadenCase_문자열_만들기;

import java.util.Scanner;

// 다시 풀어볼것
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

    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == ' ') {
                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
            } else {
                stringBuilder.append(s.charAt(i)); 
            }
        }
        return stringBuilder.toString();
    }
}
