package programmers.level2.올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }

    // Java Stack
    boolean solution(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);    
            }
            if(c == ')') {
                if(stack.size() == 0) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if(stack.size() != 0) {
            return false;
        }
        return true;
    }
}
