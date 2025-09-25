package programmers.highscore_kit.stack_queue.level2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
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
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        /*
         *  남은 기간을 먼저 계산한 뒤 나눠서 0이 되지 않는 기간은 
         *  그 다음날이 되어야 하니 + 1일을 하기 위해 Math.ceil을 이용해 올림 처리한다.
         */ 
        for(int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]);
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
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    // 다시 풀어본 문제
    // public int[] solution(int[] progresses, int[] speeds) {
    
    //     Queue<Integer> queue = new LinkedList<>();
        
    //     for(int i = 0; i < progresses.length; i++) {

    //         if((100 - progresses[i]) % speeds[i] == 0) {
    //             queue.offer((100 - progresses[i]) / speeds[i]);
    //         } else {
    //             queue.offer((100 - progresses[i]) / speeds[i] + 1);
    //         }

    //     }

    //     List<Integer> result = new ArrayList<>();
        
    //     while (!queue.isEmpty()) {
    //         int standard = queue.poll();
    //         int deploy = 1;
    //         while (!queue.isEmpty() && queue.peek() <= standard) {
    //             queue.poll();
    //             deploy++;
                
    //         }
    //         result.add(deploy);
    //     }

    //     return result.stream().mapToInt(Integer::intValue).toArray();
    // }
}
