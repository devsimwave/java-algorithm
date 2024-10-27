package programmers.level0;

public class 몫구하기 {

    public static void main(String[] args) {
        
        몫구하기 a = new 몫구하기();

        System.out.println(a.solution(0, 0));
        

    }


    public int solution(int num1, int num2) {
        
        int answer = num1 / num2;
        return answer;
    }
    
}
