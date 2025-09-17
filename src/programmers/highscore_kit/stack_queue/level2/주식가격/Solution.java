package programmers.highscore_kit.stack_queue.level2.주식가격;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        long startTime = System.currentTimeMillis();
        int[] prices1 = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution.solution(prices1)));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        
    }

    // Queue 방식
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];

        Queue<Integer> queue = new LinkedList<>();
        for(int i : prices) {
            queue.offer(i);
        }

        int index = 0;
        while(!queue.isEmpty()) {
            int currentPrice = queue.poll(); 
            for(int i = (prices.length - queue.size()); i < prices.length; i++) {
                if(currentPrice > prices[i]) { // 현재 가격이 다음 가격보다 크다면 가격이 떨어졌으니 한번 count 후 break
                    answer[index]++; // 특정 index의 count 증가
                    break;
                } 
                if(currentPrice <= prices[i]) { // 현재 가격이 다음 가격보다 같거나 크다면 계속 count 증가
                    answer[index]++; // 특정 index의 count 증가
                }
            }
            index++;
        }
        
        return answer;
    }

}
