package programmers.level0.몬자열안에_문자열;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Solution solution = new Solution();
        
        System.out.println(solution.solution(sc.nextLine(), sc.nextLine()));
        
        sc.close();

    }

    public int solution(String str1, String str2) throws Exception {

        int answer = 0;
        if((null == str1 && str1.length() > 100) && (null != str2 && str2.length() > 100)) {
            throw new Exception("문자열 오류");
        }

        if(str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
    
}
