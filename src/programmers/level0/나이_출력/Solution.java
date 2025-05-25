package programmers.level0.나이_출력;
import java.time.LocalDateTime;

/**
 * 나이_출력
 */
public class Solution {

    public static void main(String[] args) {

        Solution aa = new Solution();

        System.out.println(aa.solution(40));

        
    }

    public int solution(int age) {

        LocalDateTime date = LocalDateTime.now();

        int year = date.getYear() - 1;

        int answer = year - age;

        return answer;
    }
    
}