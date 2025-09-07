package programmers.highscore_kit.stack_queue.level1.같은_숫자는_싫어;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        Solution solution = new Solution();
        System.out.println(solution.solution(arr1));
        System.out.println(solution.solution(arr2));
        
    }
    
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                stack.push(arr[i]);
            } else if(stack.peek() == (arr[i])) {
                continue;
            } else {
                stack.push(arr[i]); 
            }
        }

        int[] answer = new int[stack.size()];
        
        for(int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
