package programmers.level2.최댓값과_최솟값;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
        sc.close();
    }

    public String solution(String s) {
        String[] stringToArray = s.split(" ");
        int minValue = Integer.parseInt(stringToArray[0]);
        int maxvalue = minValue;
        for(int i = 0; i < stringToArray.length; i++) {
            if(minValue > Integer.parseInt(stringToArray[i])) {
                minValue = Integer.parseInt(stringToArray[i]);
            }
            if(maxvalue < Integer.parseInt(stringToArray[i])) {
                maxvalue = Integer.parseInt(stringToArray[i]);
            }
        }
        return minValue + " " + maxvalue;
    }
}
