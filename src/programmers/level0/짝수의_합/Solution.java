package programmers.level0.짝수의_합;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    0 < n ≤ 1000

    입출력 예
    n	result
    10	30
    4	6
    입출력 예 설명
    입출력 예 #1

    n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
    입출력 예 #2

    n이 4이므로 2 + 4 = 6을 return 합니다.
 */
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Solution result = new Solution();
        System.out.println(result.solution(num1));
        sc.close();
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }


    /**
     * 다른 풀이 
     */
    //  public int solution(int n1) {
    //     return IntStream.rangeClosed(0, n)
    //         .filter(e -> e % 2 == 0)
    //         .sum();
    // }

    // public int solution(int n) {
        
    //     int answer = 0;


    //     for(int i = 2; i <= n; i += 2) {
    //         answer += i;
    //     }

    //     return answer;

    // }


}
