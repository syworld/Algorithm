/**
 * 문자열 압축
 * aaaaabbbbeweee
 * a5b4ewe3
 */

import java.util.*;

public class CompactString {

    public String solution(String str) {
        String answer = "";
        str += " ";

        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            char target = str.charAt(i);
            if (target == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += target;
                // 숫자를 문자화
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        CompactString compactString = new CompactString();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(compactString.solution(str));
    }
}