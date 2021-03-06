package basic.string;

/** 회문 문자열 (대소문자 구별X)
 * gooG
 * YES
 */
import java.util.*;

public class 회문문자열_7 {

    public String solution(String str) {
        String answer = "YES";

        // Solution #1
//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-1-i)) return "NO";
//        }

        // Solution #2
        String tmp = new StringBuilder(str).reverse().toString();
        // 대소문자 ignore
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";

        return answer;
    }



    public static void main(String[] args) {
        회문문자열_7 palindrom = new 회문문자열_7();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(palindrom.solution(str));
    }
}