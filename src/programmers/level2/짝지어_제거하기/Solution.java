package programmers.level2.짝지어_제거하기;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

    //TODO: 이 문제 못풀었음 다시 풀어봐야될듯
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long startTime = System.currentTimeMillis();
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }
    
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.empty()) {
                stack.push(c);
            } else {
                if(stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }
}
