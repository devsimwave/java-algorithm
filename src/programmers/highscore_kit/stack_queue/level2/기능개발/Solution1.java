package programmers.highscore_kit.stack_queue.level2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
    
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        System.out.println(Arrays.toString(sol.solution(progresses1, speeds1))); 
        // [2, 1]

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sol.solution(progresses2, speeds2)));  
        
    }

    // 1. 각 기능별 완료까지 남은 일수를 계산하여 큐에 넣기
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            queue.add((int) Math.ceil(remain / speeds[i]));
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;
            while(!queue.isEmpty() && day >= queue.peek()) {
                count++;
                queue.poll();
            } 
            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
