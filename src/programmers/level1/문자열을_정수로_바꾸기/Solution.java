package programmers.level1.문자열을_정수로_바꾸기;

import java.util.Scanner;

// 다른 코드 풀어볼것
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    public int solution(String s) {
        if(s.length() == 0) {
            return 0;
        }
        return Integer.parseInt(s);
    }
}
