package programmers.level1;

import java.util.Scanner;

public class 약수의_합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        약수의_합 solution = new 약수의_합();

        System.out.println(solution.solution(n));
    }

    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
    
}
