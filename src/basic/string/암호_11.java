package basic.string;

/**
 * 암호
 * 4
 * #****###**#####**#####**##**
 * #****## --> 1000001 -> 67 -> 'C'
 * #**#### --> 'O'
 * #**#### --> 'O'
 * #**##** --> 'L'
 */

import java.util.*;

public class 암호_11 {

    public String solution(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            // 1 또는 0으로 변환
            String binaryStr = str.substring(0, 7).replace("#", "1").replace("*", "0");
            // 이진수 변환 num = 67
            int num = Integer.parseInt(binaryStr, 2);
            // 아스키코드 변환 C
            answer += (char) num;
            str = str.substring(7);
        }
        return answer;
    }


    public static void main(String[] args) {
        암호_11 password = new 암호_11();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(password.solution(str, n));
    }
}