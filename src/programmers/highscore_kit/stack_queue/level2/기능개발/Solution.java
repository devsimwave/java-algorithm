package programmers.highscore_kit.stack_queue.level2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
    
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        System.out.println(Arrays.toString(sol.solution(progresses1, speeds1))); 
        // [2, 1]

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sol.solution(progresses2, speeds2)));  
        
    }

    // 1. 각 기능별 완료까지 남은 일수를 계산하여 큐에 넣기
    public int[] solution(int[] progress, int[] speed) {

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progress.length; i++) {
            int remain = 100 - progress[i];
            int days = (int) Math.ceil((double) remain / speed[i]);
            queue.offer(days); // offer() queue 마지막 요소에 삽입
        }

        List<Integer> result = new ArrayList<>();

        // 2. 배포 그룹 나누기
        while(!queue.isEmpty()) {
            int standard = queue.poll(); // poll() 맨 앞 요소 꺼내고 제거
            int count = 1; // 배포 되는 기능 수 default

            while(!queue.isEmpty() && queue.peek() <= standard) {   //peek() queue에 있는 마지막 값 꺼내기 제거 x
                queue.poll();
                count++;
            }
            result.add(count);
        }

        // array에 반환
        return result.stream().mapToInt(x -> x.intValue()).toArray();
    }
}
