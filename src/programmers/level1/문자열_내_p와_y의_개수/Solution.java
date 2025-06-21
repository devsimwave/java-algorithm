package programmers.level1.문자열_내_p와_y의_개수;

import java.util.Scanner;

// 문제 다 푼 거 아님
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
        sc.close();
    }

    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < s.length(); i++) {
            String subString = s.substring(i , i + 1);
            if(subString.equals("p".toUpperCase()) || subString.equals("p".toLowerCase())) {
                pCount++;
            }
            if(subString.equals("y".toUpperCase()) || subString.equals("y".toLowerCase())) {
                yCount++;
            }
        }

        if(pCount == yCount) {
            return true;
        } else {
            return false;
        }
    }
}
