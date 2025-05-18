package programmers.level0;

import java.util.Scanner;

public class 피타고라스_정의 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();

        // math.pow(밑, 지수) 
        int b_square = (int) Math.pow(c, 2) - (int) Math.pow(a, 2);
        System.out.println(b_square);
        
    }
    
}
