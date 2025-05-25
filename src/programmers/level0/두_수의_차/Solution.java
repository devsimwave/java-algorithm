package programmers.level0.두_수의_차;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int answer = Solution.solution(num1, num2);

        System.out.println(answer);

        sc.close();

    }

    public static int solution(int num1, int num2) {
        
        int answer = 0;
        
        if((num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000)) {
            answer = num1 - num2;
            
        } 
        
        return answer;
    }
    
}
 