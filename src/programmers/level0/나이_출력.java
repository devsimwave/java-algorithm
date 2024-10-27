package programmers.level0;
import java.time.LocalDateTime;

/**
 * 나이_출력
 */
public class 나이_출력 {

    public static void main(String[] args) {

        나이_출력 aa = new 나이_출력();

        System.out.println(aa.solution(40));

        
    }

    public int solution(int age) {

        LocalDateTime date = LocalDateTime.now();

        int year = date.getYear() - 1;

        int answer = year - age;

        return answer;
    }
    
}