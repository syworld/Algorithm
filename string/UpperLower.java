/**
 * 대소문자 변환
 * StuDY
 * sTUdy
 */

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        String answer = "";
        Scanner in = new Scanner(System.in);
        String str = in.next();

        // Solution 1
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        // Solution 2
        for (char x : str.toCharArray()) {
            // 대문자: 65 ~ 90
            // 소문자: 97 ~ 122

            if (x >= 97 && x <= 122) {
                answer += (char)(x - 32); // lower to upper
            } else if(x>=65 && x<=90) {
                answer += (char)(x + 32);
            }
        }

        System.out.println(answer);
    }
}