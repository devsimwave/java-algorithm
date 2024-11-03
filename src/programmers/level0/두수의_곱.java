package programmers.level0;

import java.util.Scanner;

public class 두수의_곱 {

    /**
     * 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

        제한사항
        0 ≤ num1 ≤ 100
        0 ≤ num2 ≤ 100
        입출력 예
        num1	num2	result
        3	4	12
        27	19	513
        입출력 예 설명
        입출력 예 #1

        num1이 3, num2가 4이므로 3 * 4 = 12를 return합니다.
        입출력 예 #2

        num1이 27, num2가 19이므로 27 * 19 = 513을 return합니다.
     */

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        두수의_곱 result = new 두수의_곱();

        System.out.println(result.solution(num1, num2));
        sc.close();
        
     }

    public int solution(int num1, int num2) {
        int answer = 0;

        if((num1 >= 0 && num1 <= 100) && (num2 >= 0 && num2 <= 100)) {
            return answer = num1 * num2;
        } else {
            return answer;
        }

    }

}
