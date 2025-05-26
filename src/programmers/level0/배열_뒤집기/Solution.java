package programmers.level0.배열_뒤집기;


//TODO : 배열 관련 다른 방법으로 풀어야함
public class Solution {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
        
    }
    

    public int[] solution(int[] num_list) {

        int[] answer = {};

        answer = new int[num_list.length];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }

        return answer;
    }
}
