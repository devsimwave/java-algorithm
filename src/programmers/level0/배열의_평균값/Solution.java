package programmers.level0.배열의_평균값;


// TODO: 배열문제 Stream으로 풀어볼것
public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }
    

    public double solution(int[] numbers) {
        double answer = 0;
        int avg = 0;
        for(int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        return (double) avg / numbers.length;
    }
}
