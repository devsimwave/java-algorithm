package programmers.highscore_kit.greedy.level1.체육복;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {

        Solution solution = new Solution();

        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1,3,5};

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
    
        int n4 = 3;
        int[] lost4 = {3};
        int[] reserve4 = {1};
        
        System.out.println(solution.solution(n1, lost1, reserve1));
        System.out.println(solution.solution(n2, lost2, reserve2));
        System.out.println(solution.solution(n3, lost3, reserve3));
        
    }

    // 	1.	else { break; } 때문에 한 번만 검사하고 바로 종료됨
	// •	현재 구조에서는 reserve[i]와 queue.peek()가 딱 맞지 않으면 다른 lost 학생을 전혀 검사하지 않고 바로 break 합니다.
	// •	즉, queue에 여러 명의 lost 학생이 있어도 맨 앞 한 명만 보고 판단해버리는 거예요.
	// 2.	자기 자신이 lost + reserve에 동시에 있는 경우 처리 안 됨
	// •	문제 조건에 따르면 reserve 학생이 동시에 lost라면, 그 학생은 여벌이 1벌밖에 없으므로 본인만 입고 다른 사람에게 빌려줄 수 없음.
	// •	지금 로직에는 이 조건이 빠져 있어서 정답이 달라질 수 있어요.
	// 3.	Queue를 쓰면서 순차적으로 탐색하지 않고 peek()만 확인
	// •	queue는 FIFO 구조인데, 현재 코드에서는 poll()하기 전까지는 peek()만 보니까 앞에 있는 학생과만 매칭하려고 해요.
	// •	예를 들어, reserve = 3, lost = {2, 4} 라면 사실 3은 2 또는 4 중 누구든 빌려줄 수 있는데, 현재 구조에서는 queue 맨 앞만 보고 틀려버려요.
    // public int solution(int n, int[] lost, int[] reserve) {
    //     int answer = n - lost.length;
    //     Queue<Integer> queue = new LinkedList<>();

    //     for(int i = 0; i < lost.length; i++) {
    //         queue.offer(lost[i]);
    //     }

    //     for(int i = 0; i < reserve.length; i++) {
    //         for(int j = 0; j < queue.size(); j++) {
    //             if((reserve[i] + 1) == queue.peek() || (reserve[i] - 1) == queue.peek()) {
    //                 queue.poll();
    //                 answer++;
    //                 break;
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    //     return answer;
    // }


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 1. reserve와 lost 둘 다에 있는 학생 제외
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for(int l : lost) {
            if(Arrays.stream(reserve).anyMatch(r -> r == l)) {
                // 자기 자신만 입음, 빌려줄 수 없음
                continue;
            }
            lostList.add(l);
        }

        for(int r : reserve) {
            if(Arrays.stream(lost).anyMatch(l -> l == r)) {
                continue;
            }
            reserveList.add(r);
        }

        // 2. 앞/뒤 학생한테 빌려주기
        for (int r : reserveList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        return answer - lostList.size();
        
    }
}
