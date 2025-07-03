package programmers.level2.다음_큰_숫자;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
        long endTime = System.currentTimeMillis();
        System.out.println("⏱ 실행 시간: " + (endTime - startTime) + "ms");
        sc.close();
    }

    // Stream API는 직관적이나 객체 생성 반복돼어 GC에 불필요한 메모리 쌓임 
    // Integer.toBinaryString(n).chars().filter(i -> i == '1').count(); 이 코드가 결국 Boxing unBoxing이 반복됨
    // 따라서 간단한 연산 처리는 Stream은 비효율적일 수 있음
    // public int solution(int n) {
    //     int originNumberOnlyone = (int) Integer.toBinaryString(n).chars().filter(i -> i == '1').count();
    //     int count = 1;
    //     while (true) {
    //         int nextNumberOnlyone = (int) Integer.toBinaryString(n + count).chars().filter(i -> i == '1').count();
    //         if(originNumberOnlyone == nextNumberOnlyone) {
    //             return n + count;
    //         } else {
    //             count++;
    //         }
    //     }
    // }
    public int solution(int n) {
        int originBinaryOnes = Integer.bitCount(n); // Integer.bitCount(int n)는 정수 n을 이진수로 변환했을 때 ‘1’의 개수를 반환하는 메서드
        while (true) {
            n++;
            if(Integer.bitCount(n) == originBinaryOnes) {
                return n;
            }
        }
    }
}
