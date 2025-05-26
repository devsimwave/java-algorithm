package programmers.level0.제곱수_판별하기;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution solution = new Solution();

        System.out.println(solution.solution(n));
        
        
        
    }
    

    /*
        Math.sqrt(double a) 제곱근 반환해주는 함수 a의 제곱근
        Math.pow(double a, double n) 제곱 a의 n승
    */ 
    public int solution(int n) {
        
        double sqrt = Math.sqrt(n);

        return sqrt % 1 == 0 ? 1 : 2;

    }
}
