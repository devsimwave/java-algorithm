package programmers.highscore_kit.stack_queue.level2.다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weights1 = {7,4,5,6};
        Solution solution = new Solution();
        System.out.println(solution.solution(bridge_length1, weight1, truck_weights1));
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        /*
         * 큐 = 다리 길이
         * 큐가 비어있는 경우 : 트럭에 다리올림
         * 큐가(다리 길이만큼 가득 차지 않은 경우) : 
         *  - 다리에 올라간 트럭과 다음 트럭의 합의 다리에 올라갈 수 있는 트럭 합 보다 높은 경우 : 0
         *  - 다리에 올라간 트럭과 다음 트럭의 합의 다리에 올라갈 수 있는 트럭 합 보다 낮은 경우 : 큐에 다음 트럭을 올림
         * 큐가 가득 찬 경우
         */

        Queue<Integer> queue = new LinkedList<>();

        int sum = 0;
        int time = 0;

        for(int i = 0; i < truck_weights.length; i++) { // for문으로 truck 대수만큼 반복문
            int truck = truck_weights[i];       

            while(true) {
                if(queue.isEmpty()) { // 큐가 비어있을 떄 truck을 큐에 추가
                    queue.offer(truck); // 큐를 다리라고 생각
                    sum += truck;
                    time++; // 다리에 오를 떄 시간 추가
                    break;
                } else if(queue.size() == bridge_length) { // 큐에 다리 길이가 꽉 찬 경우 첫번째 트럭 큐에서 제거
                    sum -= queue.poll();
                } else { // 다리 길이만큼 큐가 차 있지 않는 경우
                    if(sum + truck <= weight) { // weight 보다 트럭 무게 합이 넘지 않는 경우 트럭 추가
                        queue.offer(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {    // weight 보다 넘는 다면 기존 트럭이 다리를 넘을 수 있게 0 추가
                        queue.offer(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length; // 마지막 트럭도 지나가야 돼서 다리 길이만큼 + 한 후 return
    }
}
