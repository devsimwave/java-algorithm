package programmers.level0;
import java.util.Scanner;

/**
 * 문제 설명
    정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

    제한사항
    0 < num1 ≤ 100
    0 < num2 ≤ 100

    입출력 예
    num1	num2	result
    3	2	1500
    7	3	2333
    1	16	62
    입출력 예 설명

    입출력 예 #1
    num1이 3, num2가 2이므로 3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.

    입출력 예 #2
    num1이 7, num2가 3이므로 7 / 3 = 2.33333...에 1,000을 곱하면 2333.3333.... 이 되며, 정수 부분은 2333입니다.

    입출력 예 #3
    num1이 1, num2가 16이므로 1 / 16 = 0.0625에 1,000을 곱하면 62.5가 되며, 정수 부분은 62입니다.
 */

public class 두_수의_나눗셈 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        두_수의_나눗셈 result = new 두_수의_나눗셈();

        System.out.println(result.solution(num1, num2));
        
        
        
        
    }

    public int solution(int num1, int num2) {
        int answer = 0;

        if((num1 >= 0 && num1 <= 100) && (num2 >= 0 && num2 <= 100)) {

            double division = (double) num1 / num2;

            return (int) (division * 1000);

        } else {
            return answer;
        }

    }


    /* 다른 사람이 푼 거 
      이렇게 간단한걸.. 
      */
    // public int solution(int num1, int num2) {
    //     int answer = 0;
    //     return num1 * 1000 / num2;
    // }
    
}
