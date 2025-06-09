package programmers.level1.자연수_뒤집어_배열로_만들기;

import java.util.Scanner;

// TODO: 배열문제 Stream으로 풀어볼것
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        Solution solution = new Solution();
        sc.close();
    }
    

    public int[] solution(long n) {
        String st = String.valueOf(n);
        int[] answer = new int[st.length()];
        for(int i = 0; i < st.length(); i++) {
            answer[i] = Integer.parseInt(st.substring(st.length() - (i + 1), st.length() - i));
        }
        return answer;
    }
}
