package programmers.level1;

import java.util.Scanner;

public class 자릿수_더하기 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        자릿수_더하기 solution = new 자릿수_더하기();
        
        System.out.println(solution.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toString(n);

        for(int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i + 1));            
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
