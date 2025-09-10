package programmers.highscore_kit.stack_queue.level2.프로세스;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[] priorities1 = {2, 1, 3, 2};
        // int location = 2;
        // System.out.println(solution.solution(priorities1, location));
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println(solution.solution(priorities2, location2));
        
    }

    public int solution(int[] priorities, int location) {
        // 순서를 정해주는 값 default 0으로 세팅
        int answer = 0;

        // PriorityQueue 우선순위 큐
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // reserveOrder 높은 숫자로 정렬 
        for(int i : priorities) {
            queue.add(i);
        }

        // while문으로 queue가 비워질 때 까지 반복
        while (!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) { // queue와 우선순위와 똑같다면 queue제거 후 순서 정해주는 값 1씩 count
                    queue.poll();
                    answer++;
                    if(location == i) { // 프로세스 위치를 알려주는 loction과 
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
