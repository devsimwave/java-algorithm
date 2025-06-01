package programmers.level1.짝수와_홀수;

import java.util.Scanner;

// 다른 코드 풀어볼것
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        solution.solution(n);
        sc.close();
        
    }
    

    public String solution(int num) {

        if(num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
