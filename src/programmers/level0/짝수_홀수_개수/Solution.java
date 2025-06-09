package programmers.level0.짝수_홀수_개수;

// TODO: 배열문제 Stream으로 풀어볼것
public class Solution {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }

    public int[] solution(int[] num_list) {
        int evenNumCount = 0;
        int oddnumCount = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                evenNumCount++;
            } else {
                oddnumCount++;
            }     
        }
        int[] answer = {evenNumCount, oddnumCount};
        return answer;
    }
}
