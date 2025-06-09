package programmers.level1.두_정수_사이의_합;

import java.util.Scanner;

// 등차 수열의 합
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(x, y));
    }

    // public long solution(int a, int b) {

    //     long answer = 0;
    //     if((a <= -10000000 || a >= 10000000) && (b <= -10000000 || b >= 10000000)) {
    //         return 0;
    //     }

    //     if(a < b) {
    //         for(int i = a; i <= b; i++) {
    //             answer += i;
    //         }
    //     } else {
    //         for(int i = b; i <= a; i++) {
    //             answer += i;
    //         }
    //     }

    //     return answer;
    // }
    
    public long solution(int a, int b) {
        long answer = 0;
        if((a <= -10000000 || a >= 10000000) && (b <= -10000000 || b >= 10000000)) {
            return 0;
        }
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        if(min != max) {
            for(long i = min; i <= max; i++) {
                answer += i;
            }
        } else {
            return min;
        }
        return answer;
    }

    // TODO: 등차 수열의 합
    // public long solution(int a, int b) {
    //     return sumAtoB(Math.min(a, b), Math.max(b, a));
    // }

    // private long sumAtoB(long a, long b) {
    //     return (b - a + 1) * (a + b) / 2;
    // }
}
